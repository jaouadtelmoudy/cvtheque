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


import com.org.dao.VillesDAO;

import com.org.entities.Villes;

@RestController
@RequestMapping("/villes")
public class VillesController {
	
	@Autowired
	private VillesDAO villesDAO;
	
	@GetMapping
	public List<Villes> getAllVilles(){
		return villesDAO.getAllVilles();
	}
	@PostMapping
	public Villes save(@RequestBody Villes v){
		return villesDAO.save(v);
	}
	
	@PutMapping
	@RequestMapping("/{id}")
	public Villes update(@RequestBody Villes v, @PathVariable Long id){
		v.setId(id);
		return villesDAO.update(v);
	}
	
	@DeleteMapping
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Long id) {
		Villes v =new Villes();
		v.setId(id);
		villesDAO.delete(v);
	}

}
