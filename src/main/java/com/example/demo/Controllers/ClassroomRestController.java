package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Classroom;
import com.example.demo.repository.ClassroomRepo;
import com.example.demo.services.ClassroomServ;


@RestController
@RequestMapping("/classrooms")
public class ClassroomRestController {
	
	@Autowired
	  ClassroomServ cs;
	
	@GetMapping("/all") 
	 List<Classroom> getAll() {
			return cs.getAll(); 
			}
	@GetMapping("/{id}") 
	public Classroom ClassroomById(@PathVariable Integer id) {
			return cs.getClassroomById(id); 
			}
	
	@PostMapping("/add")
	public Classroom saveClassroom(@RequestBody Classroom c) {
		return cs.saveClassroom(c);
	}

	@PutMapping("/update/{id}")
	public Classroom updateClassroom(@PathVariable Integer id,@Validated @RequestBody Classroom cl) {
		/*Classroom c= cs.getClassroomById(id);
		 c.setName(cl.getName());
		return cs.saveClassroom(c);
		*/
		return  cs.updateClassroom(cl,id);
		 
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteClassroom(@PathVariable Integer id) 
{
		 	cs.deleteClassroom(id);
}  
	
}
