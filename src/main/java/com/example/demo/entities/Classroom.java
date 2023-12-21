package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Classroom {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    public Integer id;
	    public String name;
		
		@OneToMany(mappedBy = "classroom",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JsonIgnoreProperties("classroom")
		public  List<Student> students;
		
		public Classroom()
		{}
		
		public Classroom(Integer id) {
			super();
			this.id = id;
		}

		public Classroom(Integer id, String name, List<Student> students) {
			super();
			this.id = id;
			this.name = name;
			this.students = new ArrayList<>();;
		}
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public List<Student> getStudents() {
			return students;
		}
		public void setStudents(List<Student> students) {
			this.students = students;
		}

	    
	    
	
	    
	    
	   
}
