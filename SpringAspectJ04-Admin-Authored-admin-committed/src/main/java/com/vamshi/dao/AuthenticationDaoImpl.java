package com.vamshi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.vamshi.bo.UserDetailsBo;

public class AuthenticationDaoImpl implements AuthenticationDao {
	private static final String AUTH_QUERY="select count(*) from userlist where uname=? and pwd=?";
	private JdbcTemplate jt;
	
	//constructor injection
	public AuthenticationDaoImpl(JdbcTemplate jt) {
		this.jt=jt;		
	}
	//method to validate user
	public int validate(UserDetailsBo bo) {
		int count=0;
		count =jt.queryForObject(AUTH_QUERY, Integer.class, bo.getUsername(),bo.getPwd());
		return count;
	}

}
