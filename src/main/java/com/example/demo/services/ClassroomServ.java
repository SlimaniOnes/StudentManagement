package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Classroom;


public interface ClassroomServ {
	
	List<Classroom> getAll();
	
	Classroom saveClassroom(Classroom c);
	
	Classroom getClassroomById(Integer  id);
		
	Classroom updateClassroom(Classroom c, Integer id);
		
	void deleteClassroom(Integer id);
}
