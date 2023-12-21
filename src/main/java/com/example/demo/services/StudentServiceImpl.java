package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Student;
import com.example.demo.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentServ{

	@Autowired
	public StudentRepo sr;
	
	
	public StudentServiceImpl(StudentRepo sr) {
		super();
		this.sr = sr;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return sr.findAll();
	}

	@Override
	public Student saveStudent(Student s) {
		// TODO Auto-generated method stub
		return sr.save(s);
	}

	@Override
	public Student getStudentById(Integer id) {
		// TODO Auto-generated method stub
		return sr.findById(id).get();
	}

	@Override
	public Student updateStudent(Student s ,Integer id) {
		// TODO Auto-generated method stub
		 Student existingStudent = getStudentById(id);
	        existingStudent.setEmail(s.getEmail());
	        existingStudent.setClassroom(s.getClassroom());
		return sr.save(existingStudent);
	}

	@Override
	public void deleteStudent(Integer id) {
		// TODO Auto-generated method stub
		sr.deleteById(id);
	}

}
