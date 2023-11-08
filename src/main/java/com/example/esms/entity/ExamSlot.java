package com.example.esms.entity;

<<<<<<< HEAD
=======

>>>>>>> 233421645f1529671f154e945e90bd009e67522a
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
<<<<<<< HEAD
import lombok.Data;
=======
>>>>>>> 233421645f1529671f154e945e90bd009e67522a
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Exam_slot")
<<<<<<< HEAD
@Data
=======
>>>>>>> 233421645f1529671f154e945e90bd009e67522a
@Getter
@Setter
public class ExamSlot {
    @Id
    @Column(name = "id")
<<<<<<< HEAD
    private String examSlotId;
    @Column(name = "Date")
    private String date;
    @Column(name = "Hour")
    private float hour;
    @Column(name = "Time")
    private String time;

=======
    private int exam_ID;
    @Column(name = "Date")
    private String exam_Date;
    @Column(name = "Time")
    private String exam_Time;
    @Column(name = "Hour")
    private String exam_Hour;
>>>>>>> 233421645f1529671f154e945e90bd009e67522a
}
