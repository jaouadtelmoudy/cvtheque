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

import com.org.dao.LoisirsDAO;
import com.org.entities.Loisirs;

@RestController
@RequestMapping("/loisirs")
public class LoisirsController {
	
	@Autowired
	private LoisirsDAO loisirsDAO;
	
	@GetMapping
	public List<Loisirs> getAllLoisirs(){
		return loisirsDAO.getAllLoisirs();
	}
	@PostMapping
	public Loisirs save(@RequestBody Loisirs l){
		return loisirsDAO.save(l);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Loisirs update(@RequestBody Loisirs l, @PathVariable Long id){
		l.setId(id);
		return loisirsDAO.update(l);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Loisirs l =new Loisirs();
		l.setId(id);
		loisirsDAO.delete(l);
	}

}
