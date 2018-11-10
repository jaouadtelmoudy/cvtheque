package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.entities.Formations;
import com.org.repositories.FormationsRepository;

@Service
public class FormationsDAO {
	@Autowired
	private FormationsRepository formationsRepository;

	public List<Formations> getAllFormations(){
		return formationsRepository.findAll();
	}
	public Formations save(Formations f) {
		return formationsRepository.save(f);
	}
	public Formations update(Formations c) {
		return formationsRepository.saveAndFlush(c);
	}
	public void delete(Formations f) {
		formationsRepository.delete(f);
	}
}
