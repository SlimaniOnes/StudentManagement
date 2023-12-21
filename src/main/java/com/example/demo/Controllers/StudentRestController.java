package com.example.demo.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Club;
import com.example.demo.entities.Student;
import com.example.demo.services.StudentServ;

@RestController
@RequestMapping("/students")
public class StudentRestController {
	@Autowired
	StudentServ ss;
	
	
	public StudentRestController(StudentServ ss) {
		super();
		this.ss = ss;
	}

	@GetMapping("/all") 
	List<Student> getAll(){
		return ss.getAll();
	}
	
	@GetMapping("/{id}") 
	public Student StudentById(@PathVariable Integer id) {
			return ss.getStudentById(id); 
			}
	
	@PostMapping("/add")
	public Student saveStudent(@RequestBody Student s) {
		return ss.saveStudent(s);
	}

	@PutMapping("/update/{id}")
	public Student updateStudent(@PathVariable Integer id,@Validated @RequestBody Student st) {
		
		return ss.updateStudent(st, id);
		
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteStudent(@PathVariable Integer id) 
{
		 	ss.deleteStudent(id);
}  
	

}
