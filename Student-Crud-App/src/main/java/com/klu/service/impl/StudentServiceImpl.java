package com.klu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klu.model.Student;
import com.klu.repository.StudentRepository;
import com.klu.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository repository;

    @Override
    public String getWelcomeMessage() {
        return "Welcome to Student Data Center";
    }

    @Override
    public Student createStudent(Student student) {
        return repository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Student updateStudent(int id, Student student) {
        if (repository.existsById(id)) {
            student.setId(id);
            return repository.save(student);
        }
        return null;
    }

    @Override
    public String deleteStudent(int id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return "Student deleted successfully";
        }
        return "Student not found";
    }

    @Override
    public List<Student> searchStudent(String name, String course) {
        return repository.findByNameIgnoreCaseAndCourseIgnoreCase(name, course);
    }
}