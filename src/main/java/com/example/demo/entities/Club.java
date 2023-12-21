package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Club {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer REF;
	public String creationdate;
	@JsonIgnore
	   
	    @ManyToMany(mappedBy = "clubs",fetch = FetchType.LAZY)
	    
	    public List<Student> students;
	 
		public Club(Integer REF, String creationdate, List<Student> students) {
			super();
			this.REF = REF;
			this.creationdate = creationdate;
			this.students = students;
		}

		public Club() {
			super();
		}
		
	    
		public Integer getREF() {
			return REF;
		}

		public void setREF(Integer REF) {
			this.REF = REF;
		}

		public String getCreationdate() {
			return creationdate;
		}

		public void setCreationdate(String creationdate) {
			this.creationdate = creationdate;
		}

		public   List<Student> getStudents() {
			return students;
		}

		public void setStudents(List<Student> students) {
			this.students = students;
		}

	
		
		
	

	    
}
