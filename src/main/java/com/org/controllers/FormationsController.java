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

import com.org.dao.FormationsDAO;

import com.org.entities.Formations;


@RestController
@RequestMapping("/formations")
public class FormationsController {
	
	@Autowired
	private FormationsDAO formationsDAO;
	
	@GetMapping
	public List<Formations> getAllFormations(){
		return formationsDAO.getAllFormations();
	}
	@PostMapping
	public Formations save(@RequestBody Formations f){
		return formationsDAO.save(f);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Formations update(@RequestBody Formations f, @PathVariable Long id){
		f.setId(id);
		return formationsDAO.update(f);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Formations f =new Formations();
		f.setId(id);
		formationsDAO.delete(f);
	}

}
