package com.example.demo.services;

import java.util.List;

import com.example.demo.entities.Club;

public interface ClubServ {
List<Club> getAll();
	
Club saveClub(Club c);
	
Club getClubById(Integer  id);
		
Club updateClub(Club c, Integer id);
		
	void deleteClub(Integer id);
}
