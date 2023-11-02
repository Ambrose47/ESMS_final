package com.example.esms.student;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity(name = "student")
@Getter
@Setter
public class Student {
    @Id
    private String studentID;
    private String studentName;
    private String studentEmail;
}
