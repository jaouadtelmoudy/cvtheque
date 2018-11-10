package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.Experiences;
import com.org.repositories.ExperiencesRepository;

@Service
public class ExperiencesDAO {
	@Autowired
	private ExperiencesRepository experiencesRepository;
	
	public List<Experiences> getAllExpriences(){
		return experiencesRepository.findAll();
	}
	public Experiences save(Experiences e) {
		return experiencesRepository.save(e);
	}
	public Experiences update(Experiences c) {
		return experiencesRepository.saveAndFlush(c);
	}
	public void delete(Experiences e) {
		experiencesRepository.delete(e);
	}

}
