package com.example.esms.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "Student")
@Data
public class Student {

//    @Id
//    @Column(name ="student_id")
//    private String studentId;
//    @Basic
//
//    @Column(name ="student_name")
//    private String studentName;
//    @Basic
//
//    @Column(name ="student_email")
//    private String studentEmail;
    //private int studentTerm;

    // Getters, setters, constructors, etc.
    @Id
    @Column(name ="id")
    private String studentId;
    @Basic

    @Column(name ="name")
    private String studentName;
    @Basic

    @Column(name ="email")
    private String studentEmail;
    //private int studentTerm;

    // Getters, setters, constructors, etc.
}
