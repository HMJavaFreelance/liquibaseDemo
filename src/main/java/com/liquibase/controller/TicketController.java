package com.liquibase.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.liquibase.entity.DboDeploys;
import com.liquibase.service.TicketService;

@Controller
public class TicketController {
	
	@Autowired
	TicketService service;

	@RequestMapping(value="/", method = RequestMethod.GET)
    public String showLoginPage(){	
        return "ticket";
    }
	
	@RequestMapping(value="/save", method = RequestMethod.POST)
    public String saveDboDeploys(HttpServletRequest request){	
		
		DboDeploys dboDeploys = new DboDeploys();
		dboDeploys.setTicketNo(request.getParameter("ticketNo"));
		dboDeploys.setVersionTag(request.getParameter("versionTag"));	
		service.addNewDboDeploys(dboDeploys);
        return "ticket";
    }
}
