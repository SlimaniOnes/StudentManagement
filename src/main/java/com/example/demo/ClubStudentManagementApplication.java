package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.entities.Classroom;
import com.example.demo.entities.Student;
import com.example.demo.repository.ClassroomRepo;



@SpringBootApplication
public class ClubStudentManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClubStudentManagementApplication.class, args);
	

	
	    }
}
