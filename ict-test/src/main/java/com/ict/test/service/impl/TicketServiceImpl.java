package com.ict.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ict.test.dao.TicketDAO;
import com.ict.test.service.TicketService;
import com.ict.test.vo.TicketMovie;

@Service
public class TicketServiceImpl implements TicketService {

	
	@Autowired
	private TicketDAO tdao;
	
	@Override
	public List<TicketMovie> getTickets() {
		// TODO Auto-generated method stub
		return tdao.getTickets();
	}

}
