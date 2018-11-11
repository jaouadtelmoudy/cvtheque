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

import com.org.dao.LanguesDAO;

import com.org.entities.Langues;


@RestController
@RequestMapping("/langues")
public class LanguesController {
	
	@Autowired
	private LanguesDAO languesDAO;
	
	@GetMapping
	public List<Langues> getAllLangues(){
		return languesDAO.getAllLangues();
	}
	@PostMapping
	public Langues save(@RequestBody Langues l){
		return languesDAO.save(l);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Langues update(@RequestBody Langues l, @PathVariable Long id){
		l.setId(id);
		return languesDAO.update(l);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Langues l =new Langues();
		l.setId(id);
		languesDAO.delete(l);
	}

}
