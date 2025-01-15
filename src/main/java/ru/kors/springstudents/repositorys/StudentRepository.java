package ru.kors.springstudents.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.kors.springstudents.models.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteByEmail(String email);

    Student findStudentByEmail(String email);
}
