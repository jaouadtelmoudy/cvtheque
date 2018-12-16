package com.org.controllers;

import static org.hamcrest.CoreMatchers.anything;
import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.apache.catalina.filters.CorsFilter;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Matchers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.org.dao.PaysDAO;
import com.org.entities.Pays;

@RunWith(SpringJUnit4ClassRunner.class)
public class PaysControllerTest {
	
	private MockMvc mockMvc;
	@Mock
	private PaysDAO paysDAOMock;	
		
	@InjectMocks
	private PaysController paysController;
	
	ObjectMapper om = new ObjectMapper();
	
	@org.junit.Before
	public void setup(){
		mockMvc= MockMvcBuilders.standaloneSetup(paysController)				
								.build();
	}
	
	@Test
	public void getAllPays_should_be_return_200() throws Exception {
		Pays p = new Pays();
		p.setLibelle("Maroc");
		p.setId(new Long(1));
		 List<Pays> pays = Arrays.asList(p);
		when(this.paysDAOMock.getAllPays()).thenReturn(pays);
		mockMvc.perform(get("/pays").accept(MediaType.APPLICATION_JSON))		
		        .andExpect(status().isOk())
		        .andExpect(jsonPath("$[0].libelle", containsString("Maroc")));       
		 verify(this.paysDAOMock).getAllPays(); 
	}
	@Test
	public void getPaysId_should_be_return_200() throws Exception {
		Pays p = new Pays();		
		p.setLibelle("Maroc");
		p.setId(new Long(1));
		 
		when(this.paysDAOMock.getPaysParId(new Long(1))).thenReturn(null);
		mockMvc.perform(get("/pays/{id}", p.getId()).accept(MediaType.APPLICATION_JSON))		
		        .andExpect(status().isOk());       
		 verify(this.paysDAOMock).getPaysParId(p.getId()); 
	}
	
	@Test
	public void save_should_be_return_200() throws Exception {
		Pays p = new Pays();		
		p.setLibelle("Maroc");
		p.setId(null);	
		String json = "{\"libelle\":\"Maroc\"}";
		when(this.paysDAOMock.save(null)).thenReturn(p);
		mockMvc.perform(post("/pays")							
						.contentType(MediaType.APPLICATION_JSON_VALUE)
						.content(json))				        				        
				        .andExpect(status().isOk())				        
				        .andReturn();
	}
	
	
	
}