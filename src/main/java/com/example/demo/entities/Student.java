package com.example.demo.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private  Integer NSC;
	private String email;
	
	  @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	    @JoinColumn(name="class_id")
	    @JsonIgnore
	    private  Classroom classroom;
	    
	    @ManyToMany
	    @JoinTable(
	        name = "StudentClub",
	        joinColumns = @JoinColumn(name = "NSC"),
	        inverseJoinColumns = @JoinColumn(name = "REF")
	    )
	    public List<Club> clubs;
	   

		
		public Student() {
			
		}



		public Integer getNSC() {
			return NSC;
		}



		public void setNSC(Integer nSC) {
			NSC = nSC;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public Classroom getClassroom() {
			return classroom;
		}



		public void setClassroom(Classroom classroom) {
			this.classroom = classroom;
		}



		public List<Club> getClubs() {
			return clubs;
		}



		public void setClubs(List<Club> clubs) {
			this.clubs = clubs;
		}



		public Student(Integer nSC, String email, Classroom classroom, List<Club> clubs) {
			super();
			this.NSC = nSC;
			this.email = email;
			this.classroom = classroom;
			this.clubs = clubs;
		}
		
		


}