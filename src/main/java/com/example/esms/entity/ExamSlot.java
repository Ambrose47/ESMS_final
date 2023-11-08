package com.example.esms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Exam_slot")
@Data
@Getter
@Setter
public class ExamSlot {
    @Id
    @Column(name = "id")
    private String examSlotId;
    @Column(name = "Date")
    private String date;
    @Column(name = "Hour")
    private float hour;
    @Column(name = "Time")
    private String time;

}
