package com.xantrix.webapp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.xantrix.webapp.controller.PartialsController;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PartialsController.class })
@WebAppConfiguration
public class PartialsControllerTest
{
	@Autowired
	private WebApplicationContext webContext;

	private MockMvc mockMvc;

	@Before
	public void setupMockMvc()
	{
		mockMvc = MockMvcBuilders.webAppContextSetup(webContext).build();
	}

	@Test
	public void TestHomeContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/items/index"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("partials/home"));
		 	 
	}
	
	@Test
	public void TestProdottiContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/items/prodotti"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("partials/prodotti"));
	}
	
	@Test
	public void TestAppContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/items/app"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("partials/app"));
	}
	
	@Test
	public void TestNotificheContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/items/notifiche"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("partials/notifiche"));
	}
	
	@Test
	public void TestUtentiContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/items/utente"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("partials/utenti"));
		 	//.andExpect(MockMvcResultMatchers.content().string("Gestione Utenti"));
	}
	
	
	 
	
	 
	
}
