package com.ict.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ict.test.vo.TicketMovie;
import com.zaxxer.hikari.HikariDataSource;

public class ConnectionTest {

	private ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:root-context.xml");
	
	@Test
	public void conTest() {			/*최상위 폴더는 src/test/java 다 즉 resource 와 한쌍*/
		
		HikariDataSource hds = (HikariDataSource) ac.getBean("hkds");
		Connection con = null;
		try {
			con = hds.getConnection(); //트라이앤캐치
			System.out.println("연결성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		assertNotNull(con);
	}
	
	@Test
	public void sqlTest() {
		SqlSession ss = (SqlSession)ac.getBean("sqlSessionTemplate");
		TicketMovie tm = new TicketMovie();
		
		List<TicketMovie> list = ss.selectList("MOVIEINFO.selectMovie");
		assertEquals(list.size(), 850);
	}

}
