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
    private String studentId;
    private String studentName;
    private String studentEmail;
    //private int studentTerm;

    // Getters, setters, constructors, etc.
}
