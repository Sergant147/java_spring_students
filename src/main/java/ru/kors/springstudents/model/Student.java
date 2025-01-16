package ru.kors.springstudents.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.Period;

@Data
@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue
    @Column
    private Optional<Long> id;


    @Column
    private Optional<String> firstName;


    @Column
    private Optional<String> lastName;


    @Column
    private Optional<LocalDate> dateOfBirth;


    @Column(unique = true)
    private Optional<String> email;

    @Column
    private int age;

    public Student(String firstName, String secondName, LocalDate dateOfBirth, String email) {
        this.firstName = firstName;
        this.lastName = secondName;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
