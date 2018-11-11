package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.Offres;
import com.org.repositories.OffresRepository;

@Service
public class OffresDAO {
	@Autowired
	private OffresRepository offresRepository;
	
	public List<Offres> getAllOffres(){
		return offresRepository.findAll();
	}
	public Offres save(Offres o) {
		return offresRepository.save(o);
	}
	public Offres update(Offres o) {
		return offresRepository.saveAndFlush(o);
	}
	public void delete(Offres o) {
		offresRepository.delete(o);
	}

}
