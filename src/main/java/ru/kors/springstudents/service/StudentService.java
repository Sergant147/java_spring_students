package ru.kors.springstudents.service;

import ru.kors.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    Student saveStudent(Student student);

    Student findById(int id);

    Student updateStudent(Student student);

    void deleteStudent(int id);
}
