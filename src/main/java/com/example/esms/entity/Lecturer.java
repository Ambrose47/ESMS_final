package com.example.esms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "lecturer")
@Getter
@Setter
public class Lecturer {
    @Id
    private String lecturerId;
    private String lecturerName;
    private String lecturerEmail;
    private String lecturerPhone;
}
