package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.org.entities.Pays;

import com.org.repositories.PaysRepository;

@Service
public class PaysDAO {
	
	@Autowired
	private PaysRepository paysRepository;

	public List<Pays> getAllPays(){
		return paysRepository.findAll();
	}
	public Pays save(Pays p) {
		return paysRepository.save(p);
	}
	public Pays update(Pays p) {
		return paysRepository.saveAndFlush(p);
	}
	public void delete(Pays p) {
		paysRepository.delete(p);
	}

}
