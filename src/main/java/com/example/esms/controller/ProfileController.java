package com.example.esms.controller;

import com.example.esms.entity.Student;
import com.example.esms.entity.courseStudent.CourseStudent;
import jakarta.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
//import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

@RestController
@RequestMapping("")
public class ProfileController {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ProfileController(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @GetMapping("/profileStudent")
    public ResponseEntity<Object> getStudentProfileData(String email) {

        /*OAuth2User user = token.getPrincipal();
        String email = user.getAttribute("email");*/
        // Thực hiện truy vấn để lấy profile của student
        Map<String, Object> studentProfile = jdbcTemplate.queryForMap(
                "SELECT * FROM Student WHERE email = ?", email);
                if (!studentProfile.isEmpty()) {
            return ResponseEntity.ok(studentProfile);
        } else {
            // Trường hợp không tìm thấy profile hoặc địa chỉ email không phù hợp, trả về lỗi 404
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/profileLecturer")
    public ResponseEntity<Object> getLecturerProfileDatas(String email) {
        /*OAuth2User user = token.getPrincipal();
        String email = user.getAttribute("email");*/
        // Thực hiện truy vấn để lấy profile của student
        Map<String, Object> lecturerProfile = jdbcTemplate.queryForMap(
                "SELECT * FROM Lecture WHERE Email = ?", email);

        if (!lecturerProfile.isEmpty()) {
            return ResponseEntity.ok(lecturerProfile);
        } else {
            // Trường hợp không tìm thấy profile hoặc địa chỉ email không phù hợp, trả về lỗi 404
            return ResponseEntity.notFound().build();
        }
    }
}