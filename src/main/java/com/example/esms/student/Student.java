package com.example.esms.student;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "student")
@Data
public class Student {

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
