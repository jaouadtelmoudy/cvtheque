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

import com.org.dao.CandidatsDAO;
import com.org.entities.Candidats;

@RestController
@RequestMapping("/candidats")
public class CandidatsController {
	
	@Autowired
	private CandidatsDAO candidatsDAO;
	
	@GetMapping
	public List<Candidats> getAllCandidate(){
		return candidatsDAO.getAllCandidats();
	}
	@PostMapping
	public Candidats save(@RequestBody Candidats c){
		return candidatsDAO.save(c);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Candidats update(@RequestBody Candidats c, @PathVariable Long id){
		c.setId(id);
		return candidatsDAO.update(c);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Candidats c =new Candidats();
		c.setId(id);
		candidatsDAO.delete(c);
	}

}
