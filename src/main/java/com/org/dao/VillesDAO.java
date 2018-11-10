package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.org.entities.Pays;
import com.org.entities.Villes;
import com.org.repositories.PaysRepository;
import com.org.repositories.VillesRepository;
@Service
public class VillesDAO {
	
	@Autowired
	private VillesRepository villesRepository;

	public List<Villes> getAllFormations(){
		return villesRepository.findAll();
	}
	public Villes save(Villes v) {
		return villesRepository.save(v);
	}
	public Villes update(Villes v) {
		return villesRepository.saveAndFlush(v);
	}
	public void delete(Villes v) {
		villesRepository.delete(v);
	}

}
