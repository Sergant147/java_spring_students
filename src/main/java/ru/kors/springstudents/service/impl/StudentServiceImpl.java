package ru.kors.springstudents.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.repository.StudentRepository;
import ru.kors.springstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
@Primary
public class StudentServiceImpl implements StudentService {
    private StudentRepository repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public Student findStudentById(int id) {
        return repository.findStudentById(id);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.save(student);
    }


    @Override
    public void deleteStudent(int id) {
        repository.deleteById((long)id);
    }
}
