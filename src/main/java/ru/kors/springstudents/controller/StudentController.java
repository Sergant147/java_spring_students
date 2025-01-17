package ru.kors.springstudents.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.kors.springstudents.model.Student;
import ru.kors.springstudents.service.StudentService;

import java.util.List;


@RestController
@RequestMapping("/api/students")
@AllArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }

    @PostMapping
    public Student saveStudent(@RequestBody Student student) {
        service.saveStudent(student);
        return student;
    }

    @GetMapping("/{id}")
    public Student findByEmail(@PathVariable int id) {
        return service.findByEmail(id);
    }

    @PutMapping
    public Student updateStudent(@RequestBody Student student) {
        return service.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
    }
}
