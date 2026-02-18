package com.klu.service;

import java.util.List;
import com.klu.model.Student;

public interface StudentService {

    String getWelcomeMessage();

    Student createStudent(Student student);

    List<Student> getAllStudents();

    Student getStudentById(int id);

    Student updateStudent(int id, Student student);

    String deleteStudent(int id);

    List<Student> searchStudent(String name, String course);
}