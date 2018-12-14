package com.org.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.org.entities.Organisme;

import com.org.repositories.OrganismesRepository;

@Component
public class OrganismesDAO {
	@Autowired
	private OrganismesRepository organismesRepository;
	
	public List<Organisme> getAllOrganismes(){
		return organismesRepository.findAll();
	}
	public Organisme save(Organisme o) {
		return organismesRepository.save(o);
	}
	public Organisme update(Organisme o) {
		return organismesRepository.saveAndFlush(o);
	}
	public void delete(Organisme o) {
		organismesRepository.delete(o);
	}
}
