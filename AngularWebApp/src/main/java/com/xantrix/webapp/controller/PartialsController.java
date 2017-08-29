package com.xantrix.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class PartialsController
{
	@RequestMapping(value = "/index")
	public String getIndexTemplate()
	{
		return "partials/home";
	}
	
	@RequestMapping(value = "/prodotti")
	public String getProdottiTemplate()
	{
		return "partials/prodotti";
	}
	
	@RequestMapping(value = "/app")
	public String getAppTemplate()
	{
		return "partials/app";
	}
	
	@RequestMapping(value = "/notifiche")
	public String getNotificheTemplate()
	{
		return "partials/notifiche";
	}
	
	@RequestMapping(value = "/utente")
	public String getUtenteTemplate()
	{
		return "partials/utenti";
	}
}
