package com.example.esms.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("")
public class EditExamController {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public EditExamController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/editexam")
    public ResponseEntity<Object> deleteExamSchedule(String room,String slotId, String courseId) {
        try {
            jdbcTemplate.update("delete from Exam_schedule where Room_id = ? and slot_id =? and course_id = ?",room, slotId,courseId);
            return ResponseEntity.ok("Success");
        }
        catch (Exception e){
            return ResponseEntity.ok(e.getMessage());
        }
    }
}
