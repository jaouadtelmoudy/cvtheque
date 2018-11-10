package com.org.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.dao.ExperiencesDAO;

@RestController
@RequestMapping("/Experiences")
public class ExperiencesController {
	@Autowired
	private ExperiencesDAO experiencesDAO;
	
	
	

}
