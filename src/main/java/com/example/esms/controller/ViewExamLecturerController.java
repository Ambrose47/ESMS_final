package com.example.esms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("")
public class ViewExamLecturerController {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ViewExamLecturerController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/viewexamlecturerchoose")
    public ResponseEntity<Object> getViewExamLecturerChooseData(String email) {
        /*OAuth2User user = token.getPrincipal();
        String email = user.getAttribute("email");*/
        // Thực hiện truy vấn để lấy profile của student
//        Map<String, Object> lecturerProfile = jdbcTemplate.queryForMap(
//                "SELECT * FROM Lecture WHERE email = ?", email);
//        String stuID = (String) lecturerProfile.get("id");
        List<Map<String, Object>> viewExamSchedule = jdbcTemplate.queryForList(
                "select * from Exam_schedule exch inner join Exam_slot exsl on exch.slot_id = exsl.id inner join Lecture le on exch.lecture_id = le.id where le.Email = ?",email);

        if (!viewExamSchedule.isEmpty()) {
            return ResponseEntity.ok(viewExamSchedule);
        } else {
            // Trường hợp không tìm thấy profile hoặc địa chỉ email không phù hợp, trả về lỗi 404
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/viewexamlecturer")
    public ResponseEntity<Object> getViewExamLecturerData() {
        /*OAuth2User user = token.getPrincipal();
        String email = user.getAttribute("email");*/
        // Thực hiện truy vấn để lấy profile của student
//        Map<String, Object> lecturerProfile = jdbcTemplate.queryForMap(
//                "SELECT * FROM Lecture WHERE email = ?", email);
//        String stuID = (String) lecturerProfile.get("id");
        List<Map<String, Object>> viewExamSchedule = jdbcTemplate.queryForList(
                "SELECT distinct es.slot_id,es.course_id,el.Date,el.Time,es.Room_id,es.lecture_id FROM [ESMS_v3].[dbo].[Exam_schedule] es inner join Exam_slot el on el.id = es.slot_id Where es.lecture_id is null order by es.slot_id");

        if (!viewExamSchedule.isEmpty()) {
            return ResponseEntity.ok(viewExamSchedule);
        } else {
            // Trường hợp không tìm thấy profile hoặc địa chỉ email không phù hợp, trả về lỗi 404
            return ResponseEntity.notFound().build();
        }
    }


}
