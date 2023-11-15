package com.example.esms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("")
public class ReasonController {
    private JdbcTemplate jdbcTemplate;
    @Autowired
    public ReasonController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate  = jdbcTemplate;
    }

    @GetMapping("/reason")
    public ResponseEntity<List<Map<String,Object>>> getReason(){
        try {
            List<Map<String, Object>> listReason = jdbcTemplate.queryForList("select L.Email,e.Date,e.Time,reason from Reason inner join dbo.Exam_schedule Es on Es.id = Reason.examScheduleId inner join dbo.Lecture L on Es.lecture_id = L.id inner join dbo.Exam_slot E on Es.slot_id = E.id");
            return ResponseEntity.ok(listReason);
        }
        catch (Exception e){
            throw e;
        }
    }
}
