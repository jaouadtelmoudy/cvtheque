package com.org.controllers;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.client.match.MockRestRequestMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.catalina.filters.CorsFilter;
import org.aspectj.lang.annotation.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
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
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.org.dao.PaysDAO;
import com.org.entities.Pays;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class PaysControllerTest {
	@InjectMocks
    private PaysController paysController;
	private MockMvc mockMvc;

	@Mock
	private PaysDAO paysDAOMock;
	@Autowired
    private WebApplicationContext ctx;
	
	
	@org.junit.Before
    public void init(){
        MockitoAnnotations.initMocks(this);
        mockMvc = MockMvcBuilders
                .standaloneSetup(paysController)
                .addFilters(new CorsFilter())
                .build();
    }
	
	@Test
	public void should_be_return_200() {
		/*Pays p = new Pays();
		p.setLibelle("Maroc");
		 List<Pays> pays = Arrays.asList(p);
		when(this.paysDAOMock.getAllPays()).thenReturn(pays);
		mockMvc.perform(get("/pays"))		
        .andExpect(status().isOk())        
        .andExpect(jsonPath("$.libelle", is("")))
        .andDo(MockMvcResultHandlers.print());*/
	}

}
