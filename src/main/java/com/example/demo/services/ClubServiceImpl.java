package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Club;
import com.example.demo.repository.ClassroomRepo;
import com.example.demo.repository.ClubRepo;

@Service
public class ClubServiceImpl implements ClubServ {

	@Autowired
	public ClubRepo crp;
	
	
	
	public ClubServiceImpl(ClubRepo crp) {
		super();
		this.crp = crp;
	}

	@Override
	public List<Club> getAll() {
		// TODO Auto-generated method stub
		return crp.findAll();
	}

	@Override
	public Club saveClub(Club c) {
		// TODO Auto-generated method stub
		return crp.save(c);
	}

	@Override
	public Club getClubById(Integer id) {
		// TODO Auto-generated method stub
		
		return crp.findById(id).get();
	}

	@Override
	public Club updateClub(Club c, Integer id) {
		// TODO Auto-generated method stub
		 Club existingClub = getClubById(id);
	        existingClub.setCreationdate(c.getCreationdate());
		return crp.save(existingClub);
	}

	@Override
	public void deleteClub(Integer id) {
		// TODO Auto-generated method stub
		crp.deleteById(id);
	}

}
