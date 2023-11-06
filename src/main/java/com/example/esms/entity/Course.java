package com.example.esms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "course")
@Data
public class Course {
    @Id
    private String courseId;
    private String courseName;
    private float courseHour;


    // getters and setters
}


