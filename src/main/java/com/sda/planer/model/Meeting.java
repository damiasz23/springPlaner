package com.sda.planer.model;

import org.springframework.format.annotation.DateTimeFormat;
import org.thymeleaf.util.StringUtils;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Meeting {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String description;
    @ManyToOne
    private Room room;
    @ManyToOne
    private Employee owner;
    @ManyToMany
    private List<Employee> attendees;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    public Meeting() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public List<Employee> getAttendees() {
        return attendees;
    }

    public void setAttendees(List<Employee> attendees) {
        this.attendees = attendees;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Employee getOwner() {
        return owner;
    }

    public void setOwner(Employee owner) {
        this.owner = owner;
    }

    public int getattendeesCount(){
        return (attendees == null ? 0 : attendees.size()) + 1;
    }
    public String getshortenedDeccription(){
        return StringUtils.abbreviate(description, 20);
    }
}
