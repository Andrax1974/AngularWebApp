package com.xantrix.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/items")
public class PartialsController
{
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String getIndexTemplate()
	{
		return "partials/home";
	}
	
	@RequestMapping(value = "/prodotti", method = RequestMethod.GET)
	public String getProdottiTemplate()
	{
		return "partials/prodotti";
	}
	
	@RequestMapping(value = "/app", method = RequestMethod.GET)
	public String getAppTemplate()
	{
		return "partials/app";
	}
	
	@RequestMapping(value = "/notifiche", method = RequestMethod.GET)
	public String getNotificheTemplate()
	{
		return "partials/notifiche";
	}
	
	@RequestMapping(value = "/utente", method = RequestMethod.GET)
	public String getUtenteTemplate()
	{
		return "partials/utenti";
	}
}
