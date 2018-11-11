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

import com.org.dao.OffresDAO;
import com.org.dao.OrganismesDAO;
import com.org.entities.Offres;
import com.org.entities.Organisme;

@RestController
@RequestMapping("/offres")
public class OffresController {
	
	@Autowired
	private OffresDAO offresDAO;
	
	@GetMapping
	public List<Offres> getAllOffres(){
		return offresDAO.getAllOffres();
	}
	@PostMapping
	public Offres save(@RequestBody Offres o){
		return offresDAO.save(o);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Offres update(@RequestBody Offres o, @PathVariable Long id){
		o.setId(id);
		return offresDAO.update(o);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Offres o =new Offres();
		o.setId(id);
		offresDAO.delete(o);
	}


}
