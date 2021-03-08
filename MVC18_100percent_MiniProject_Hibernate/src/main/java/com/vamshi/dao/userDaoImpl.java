package com.vamshi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import com.vamshi.bo.UserBO;



@Repository
public class userDaoImpl implements UserDao {
	private static final String AUTH_QUERY="select count(*) from UserBO where username=:user and password=:pwd";
    @Autowired
    private HibernateTemplate ht;
    
    public long validate(UserBO bo) {
    	List<?> list=null;
    	long count=0;
    	list=ht.findByNamedParam(AUTH_QUERY, new String[]{"user" ,"pwd"},new Object[] {bo.getUsername(),bo.getPassword()});
    	count=(long)list.get(0);
    	return count;
    	
    }
}
