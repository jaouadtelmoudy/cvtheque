package com.org.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.OrganismesDAO;
import com.org.dao.PaysDAO;
import com.org.entities.Organisme;
import com.org.entities.Pays;

@RestController
@RequestMapping("/organismes")
public class OrganismesController {
	
	@Autowired
	private OrganismesDAO organismesDAO;
	
	@GetMapping
	public List<Organisme> getAllOrganismes(){
		return organismesDAO.getAllOrganismes();
	}
	@PostMapping
	public Organisme save(@RequestBody Organisme o){
		return organismesDAO.save(o);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Organisme update(@RequestBody Organisme o, @PathVariable Long id){
		o.setId(id);
		return organismesDAO.update(o);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Organisme o =new Organisme();
		o.setId(id);
		organismesDAO.delete(o);
	}


}
