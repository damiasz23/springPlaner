package com.sda.planer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String roomNumber;
    private int capasity;

    public Room() {
    }

    public Room(String roomNumber, int capasity) {
        this.roomNumber = roomNumber;
        this.capasity = capasity;
    }
}
