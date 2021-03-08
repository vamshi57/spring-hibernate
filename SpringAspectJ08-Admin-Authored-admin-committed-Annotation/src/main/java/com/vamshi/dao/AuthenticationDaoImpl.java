package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.UserDetailsBo;
@Repository
public class AuthenticationDaoImpl implements AuthenticationDao {
	
	private static final String AUTH_QUERY="select count(*) from userlist where uname=? and pwd=?";
	
	@Autowired
	private JdbcTemplate jt;
	

	public int validate(UserDetailsBo bo) {
		int count=0;
		System.out.println("AuthenticationDaoImpl.validate()");
		count =jt.queryForObject(AUTH_QUERY, Integer.class, bo.getUsername(),bo.getPwd());
		System.out.println(count);
		return count;
	}

}
