package com.ict.test.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ict.test.dao.TicketDAO;
import com.ict.test.vo.TicketMovie;

@Repository
public class TicketDAOImpl implements TicketDAO {

	@Autowired
	private SqlSession ss;
	
	@Override
	public List<TicketMovie> getTickets() {
		// TODO Auto-generated method stub
		return ss.selectList("MOVIEINFO.selectMovie");
	}

}
