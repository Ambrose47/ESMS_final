package com.example.esms.courseStudent;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@EqualsAndHashCode
public class CourseStudentPK implements Serializable {
    @Column(name ="course_id")
    @Id
    private String courseId;
    @Column(name = "student_id")
    @Id

    private String studentId;
}
