package com.example.esms.entity;

import com.example.esms.entity.courseStudent.CourseStudent;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
import java.util.List;

@Entity
@Table(name = "course")
@Data
public class Course {
    @Id
    @Column(name = "id")
    private String courseId;
    private String courseName;
    private float courseHour;

    @OneToMany(mappedBy = "courseByCourseId" )
    private List<CourseStudent> courseStudentsbyId;

    // getters and setters
}


