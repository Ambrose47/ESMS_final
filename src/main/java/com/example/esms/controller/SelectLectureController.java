package com.example.esms.controller;


import com.example.esms.entity.ExamSlot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class SelectLectureController {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public SelectLectureController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/selectLecture")
    public ResponseEntity<Object> setLectureToExamSchedule(String emailLecture,String slotId) {
        try {
        /*OAuth2User user = token.getPrincipal();
        String email = user.getAttribute("email");*/
            // Thực hiện truy vấn để lấy profile của student
            Map<String, Object> lecture = jdbcTemplate.queryForMap("SELECT * from Lecture WHERE Email = ?", emailLecture);
            List<Map<String, String>> examSlotArr = jdbcTemplate.query("Select id,slot_id  from Exam_schedule es where lecture_id is null and slot_id = ?", new ResultSetExtractor<List<Map<String, String>>>() {
                @Override
                public List<Map<String, String>> extractData(ResultSet rs) throws SQLException, DataAccessException {
                    List<Map<String, String>> listRet = new ArrayList<>();
                    while (rs.next()) {
                        Map<String, String> mapRet = new HashMap<>();
                        mapRet.put("id", rs.getString("id"));
                        mapRet.put("slot_id", rs.getString("slot_id"));
                        listRet.add(mapRet);
                    }
                    return listRet;
                }
            },slotId);

            if(examSlotArr!= null) {
                jdbcTemplate.update("update Exam_schedule set lecture_id=? where id = ?", lecture.get("id"), examSlotArr.get(0).get("id"));
                return ResponseEntity.ok("Success");
            }else {
                return ResponseEntity.ok("FullSlot");
            }
        }
        catch (Exception e){
            return ResponseEntity.ok("Error unknown");

        }
    }


}