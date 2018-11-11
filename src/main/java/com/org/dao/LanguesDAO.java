package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.entities.Langues;
import com.org.repositories.LanguesRepository;
@Service
public class LanguesDAO {
	
	@Autowired
	private LanguesRepository languesRepository;

	public List<Langues> getAllLangues(){
		return languesRepository.findAll();
	}
	public Langues save(Langues l) {
		return languesRepository.save(l);
	}
	public Langues update(Langues l) {
		return languesRepository.saveAndFlush(l);
	}
	public void delete(Langues l) {
		languesRepository.delete(l);
	}

}
