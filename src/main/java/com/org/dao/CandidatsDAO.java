package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.Candidats;
import com.org.repositories.CandidatsRepository;

@Service
public class CandidatsDAO {
	
	@Autowired
	private CandidatsRepository candidatsRepository;
	
	public List<Candidats> getAllCandidats(){
		return candidatsRepository.findAll();
	}
	public Candidats save(Candidats c) {
		return candidatsRepository.save(c);
	}
	public Candidats update(Candidats c) {		
		return candidatsRepository.saveAndFlush(c);
	}
	public void delete(Candidats c) {
		candidatsRepository.delete(c);
	}

}
