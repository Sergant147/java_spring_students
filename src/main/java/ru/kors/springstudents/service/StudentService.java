package ru.kors.springstudents.service;

import ru.kors.springstudents.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAllStudent();

    Student createStudent(Student student);

    Student findStudentById(long id);

    Student updateStudent(Student student);

    void deleteStudent(long id);
}
