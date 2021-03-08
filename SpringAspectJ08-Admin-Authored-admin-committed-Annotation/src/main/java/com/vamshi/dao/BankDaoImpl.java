package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
@Repository
public class BankDaoImpl implements BankDao {
	@Autowired
	private JdbcTemplate jt;
	
	private static final String WITHDRAW_QUERY="update bankaccount set balance=balance-? where acno=?";
	private static final String DEPOSITE_QUERY="update bankaccount set balance=balance+? where acno=?";
	
	
	
	public int withdraw(int acno, float amt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,acno);
    	return count;
    }
    public int deposite(int acno, float amt) {
    	int count=0;
    	System.out.println("BankDaoImpl.deposite()");
    	
		count=jt.update(DEPOSITE_QUERY, amt,acno);
		System.out.println(count);
    	return count;
   }
    
}
