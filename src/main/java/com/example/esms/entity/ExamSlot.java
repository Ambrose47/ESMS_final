package com.example.esms.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Exam_slot")
@Getter
@Setter
public class ExamSlot {
    @Id
    @Column(name = "id")
    private int exam_ID;
    @Column(name = "Date")
    private String exam_Date;
    @Column(name = "Time")
    private String exam_Time;
    @Column(name = "Hour")
    private String exam_Hour;
}
