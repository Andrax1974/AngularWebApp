package com.xantrix.webapp;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.xantrix.webapp.controller.IndexController;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { IndexController.class })
@WebAppConfiguration
public class IndexControllerTest
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
	public void TestIndexContr() throws Exception
	{
		 mockMvc.perform(MockMvcRequestBuilders.get("/"))
		 	.andExpect(MockMvcResultMatchers.status().isOk())
		 	.andExpect(MockMvcResultMatchers.view().name("index"));
		    //.andExpect(MockMvcResultMatchers.content().string("Home Page"));
	}
}
