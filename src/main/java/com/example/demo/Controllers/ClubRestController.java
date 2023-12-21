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
import com.example.demo.services.ClubServ;

@RestController
@RequestMapping("/clubs")
public class ClubRestController {
	@Autowired
	ClubServ cr;
	
	@GetMapping("/all") 
	List<Club> getAll(){
		return cr.getAll();
	}
	
	@GetMapping("/{id}") 
	public Club ClubById(@PathVariable Integer id) {
			return cr.getClubById(id); 
			}
	
	@PostMapping("/add")
	public Club saveClub(@RequestBody Club c) {
		return cr.saveClub(c);
	}

	@PutMapping("/update/{id}")
	public Club updateClub(@PathVariable Integer id, @RequestBody Club cl) {
		
		return cr.updateClub(cl, id);
		
	}
	
	@DeleteMapping("delete/{id}")
	public void deleteClub(@PathVariable Integer id) 
{
		 	cr.deleteClub(id);
}  
	

}
