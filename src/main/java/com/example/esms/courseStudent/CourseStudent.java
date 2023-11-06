package com.example.esms.courseStudent;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Course_student")
@IdClass(CourseStudentPK.class)
@Getter
@Setter
@EqualsAndHashCode
public class CourseStudent {
    @Id
    @Column(name = "Course_id")
    private String courseId;
    @Id
    @Column(name = "Student_ID")
    private String studentId;
}
