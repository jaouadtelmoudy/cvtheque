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

import com.org.dao.ExperiencesDAO;
import com.org.entities.Experiences;


@RestController
@RequestMapping("/experiences")
public class ExperiencesController {
	@Autowired
	private ExperiencesDAO experiencesDAO;
	
	
	@GetMapping
	public List<Experiences> getAllExperiences(){
		return experiencesDAO.getAllExpriences();
	}
	@PostMapping
	public Experiences save(@RequestBody Experiences e){
		return experiencesDAO.save(e);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Experiences update(@RequestBody Experiences e, @PathVariable Long id){
		e.setId(id);
		return experiencesDAO.update(e);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Experiences e =new Experiences();
		e.setId(id);
		experiencesDAO.delete(e);
	}
	

}
