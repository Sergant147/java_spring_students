package ru.kors.springstudents.models;

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
    private Optional<Long> id;
    private Optional<String> firstName;
    private Optional<String> lastName;
    private Optional<LocalDate> dateOfBirth;
    @Column(unique = true)
    private Optional<String> email;
    private int age;

    public Student(String firstName_, String secondName_, LocalDate dateOfBirth_, String email_) {
        this.firstName = firstName_;
        this.secondName = secondName_;
        this.dateOfBirth = dateOfBirth_;
        this.email = email_;
        this.age = Period.between(dateOfBirth, LocalDate.now()).getYears();
        ;
    }

    public int getAge() {
        return Period.between(dateOfBirth, LocalDate.now()).getYears();
    }
}
