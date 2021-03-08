package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.UserBO;

@Repository
public class userDaoImpl implements UserDao {
	private static final String AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE USERNAME=? AND PASSWORD=?";
    @Autowired
    private JdbcTemplate jt;
    
    public int validate(UserBO bo) {
    	
    	int count=0;
    	count=jt.queryForObject(AUTH_QUERY,Integer.class,bo.getUsername(),bo.getPassword());
    	System.out.println(count);
    	System.out.println("userDaoImpl.validate()");
    	return count;
    }
}
