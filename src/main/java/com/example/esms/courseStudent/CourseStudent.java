package com.example.esms.courseStudent;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "course_student")
@IdClass(CourseStudentPK.class)
@Getter
@Setter
@EqualsAndHashCode
public class CourseStudent {
    @Id
    @Column(name = "course_id")
    private String courseId;
    @Id
    @Column(name = "student_id")
    private String studentId;
}
