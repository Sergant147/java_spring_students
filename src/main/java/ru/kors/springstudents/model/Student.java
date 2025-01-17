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
    @Column(unique = true)
    private Optional<Long> id;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private LocalDate dateOfBirth;

    private String email;

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
