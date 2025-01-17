package ru.kors.springstudents.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kors.springstudents.model.Student;

import java.util.List;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(int id);

    Student findStudentByEmail(int id);

    Student save(Student student);

    List<Student> findAll();
}
