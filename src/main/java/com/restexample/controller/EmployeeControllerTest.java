package com.restexample.controller;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.AdditionalAnswers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration()
@WebAppConfiguration
public class EmployeeControllerTest {

	
	

	
	@Autowired
    private WebApplicationContext wac;
    private MockMvc mockMvc;
    
    @Before
    public void setUp() throws Exception {
        this.mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }
    @Configuration
    @EnableWebMvc
    public static class TestConfiguration {
    @Bean
    public EmployeeController employeeController() {
        return new EmployeeController();
    }
    }

	@Test
	public void testGetEmployeeInJSON() throws Exception{
		Integer id = 2;
	    mockMvc.perform(get("/contact/{id}",id).accept(MediaType.APPLICATION_JSON))
	            .andDo(print());
	            
	}
	
//		 mockMvc.perform(get("/employee/name" ).accept(MediaType.APPLICATION_JSON))
//         .andDo(print())
//         .andExpect(status().isOk())
//         .andExpect(content().contentTypeCompatibleWith(MediaType.APPLICATION_JSON))
//         .andExpect(jsonPath("$.name", is("saleem")))
// ;
//}


	@Test
	public void testGetEmployeeInXML() {
		fail("Not yet implemented"); // TODO
	}

}
