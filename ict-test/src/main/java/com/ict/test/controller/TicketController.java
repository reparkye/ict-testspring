package com.ict.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ict.test.service.TicketService;

@Controller
public class TicketController {

	@Autowired
	TicketService ts;
	
	@RequestMapping(value="/tickets",method=RequestMethod.GET)
	public String getTickets(Model m) {
		System.out.println("fmlf"); //오류 확인하기 위함
		m.addAttribute("list",ts.getTickets());
		return "ticket/ticketList";
	}
	
	
}
