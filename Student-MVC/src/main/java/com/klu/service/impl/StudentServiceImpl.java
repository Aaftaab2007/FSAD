package com.klu.service.impl;

import java.util.List;  
import java.util.ArrayList;
import com.klu.service.StudentService;



import org.springframework.stereotype.Service;
import com.klu.model.Student;

@Service
public class StudentServiceImpl implements StudentService{
	private List<Student> studentList=new ArrayList<>();
	
	@Override
	public String getWelcomeMessage() {
		return "Welcome to Student data center";
	}
	
	@Override
	public List<Student> getAllStudents(){
		return studentList;
	}
	
	@Override
	public Student createStudent(Student student) {
		studentList.add(student);
		return student;
	}
	
	public Student getStudentById(int id){
		for(Student s: studentList) {
			if(s.getId()==id) {
				return s;
			}
		}
		return null;
	}
	
	@Override
	public Student updateStudent(int id, Student student) {
		for(int i=0;i<studentList.size();i++) {
			if(studentList.get(i).getId()==id) {
				student.setId(id);
				studentList.set(i, student);
				return student;
			}
		}
		return null;
	}
	
	@Override
	public String deleteStudent(int id) {
		for(Student s:studentList) {
			if(s.getId()==id) {
				studentList.remove(s);
				return "Student record deleted successfully";
			}
		}
		return "No student record found";
	}
	
	@Override
	public List<Student> searchStudent(String name, String course){
		List<Student> result=new ArrayList<>();
		for(Student s: studentList) {
			if(s.getName().equalsIgnoreCase(name)&& s.getCourse()==course);
			result.add(s);
		}
		return result;
	}
	
	
}