package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.entities.Loisirs;

import com.org.repositories.LoisirsRepository;
@Service
public class LoisirsDAO {
	@Autowired
	private LoisirsRepository loisirsRepository;

	public List<Loisirs> getAllLoisirs(){
		return loisirsRepository.findAll();
	}
	public Loisirs save(Loisirs l) {
		return loisirsRepository.save(l);
	}
	public Loisirs update(Loisirs l) {
		return loisirsRepository.saveAndFlush(l);
	}
	public void delete(Loisirs l) {
		loisirsRepository.delete(l);
	}

}
