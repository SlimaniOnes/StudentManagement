package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.entities.Classroom;
import com.example.demo.repository.ClassroomRepo;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;

@Service
public class ClassroomServiceImpl implements ClassroomServ {

	@Autowired
	public ClassroomRepo cr;
	
	
	
	public ClassroomServiceImpl(ClassroomRepo cr) {
		super();
		this.cr = cr;
	}

	@Override
	public List<Classroom> getAll() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

	@Override
	public Classroom saveClassroom(Classroom c) {
		// TODO Auto-generated method stub
		return cr.save(c);
	}

	@Override
	public Classroom getClassroomById(Integer id) {
		// TODO Auto-generated method stub
		return cr.findById(id).orElseThrow(()-> new EntityNotFoundException("Classroom not found with id:"+id));
	}

	@Override
	 @Transactional
	public Classroom updateClassroom(Classroom c,Integer id) {
		// TODO Auto-generated method stub
	     Classroom existingClassroom = getClassroomById(id);
	        existingClassroom.setName(c.getName());
	        existingClassroom.setStudents(c.getStudents());
	       
		return cr.save(existingClassroom);
	}

	@Override
	public void deleteClassroom(Integer id) {
		// TODO Auto-generated method stub
		cr.deleteById(id);
	}

}
