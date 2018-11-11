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


import com.org.dao.PaysDAO;

import com.org.entities.Pays;

@RestController
@RequestMapping("/pays")
public class PaysController {
	
	@Autowired
	private PaysDAO paysDAO;
	
	@GetMapping
	public List<Pays> getAllPays(){
		return paysDAO.getAllPays();
	}
	@PostMapping
	public Pays save(@RequestBody Pays p){
		return paysDAO.save(p);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Pays update(@RequestBody Pays p, @PathVariable Long id){
		p.setId(id);
		return paysDAO.update(p);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Pays c =new Pays();
		c.setId(id);
		paysDAO.delete(c);
	}

}
