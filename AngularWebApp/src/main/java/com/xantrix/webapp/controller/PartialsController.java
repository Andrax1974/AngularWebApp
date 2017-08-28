package com.xantrix.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class PartialsController
{
	@RequestMapping(value = "/index")
	public String getStartTemplate()
	{
		return "partials/home";
	}
	
	@RequestMapping(value = "/prodotti")
	public String getWorkOutTemplate()
	{
		return "partials/prodotti";
	}
	
	@RequestMapping(value = "/app")
	public String getFinishTemplate()
	{
		return "partials/app";
	}
	
	@RequestMapping(value = "/utente")
	public String getDescriptionPane()
	{
		return "partials/utenti";
	}
}
