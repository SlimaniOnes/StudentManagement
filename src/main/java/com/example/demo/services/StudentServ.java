package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Student;

public interface StudentServ {

List<Student> getAll();
	
Student saveStudent(Student s);
	
Student getStudentById(Integer  id);
		
Student updateStudent(Student s,Integer id);
		
	void deleteStudent(Integer id);
}
