package com.example.demo.room;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "classroom")
@Data
public class Room {
    @Id
    private String roomId;
}
