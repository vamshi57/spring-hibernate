package com.vamshi.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDaoImpl implements BankDao {
	private JdbcTemplate jt;
	
	private static final String WITHDRAW_QUERY="update bankaccount set balance=balance-? where acno=?";
	private static final String DEPOSITE_QUERY="update bankaccount set balance=balance+? where acno=?";
	
	public BankDaoImpl(JdbcTemplate jt) {
		this.jt=jt;
		
	}
	
	
	public int withdraw(int acno, float amt) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY, amt,acno);
    	return count;
    }
    public int deposite(int acno, float amt) {
    	int count=0;
		count=jt.update(DEPOSITE_QUERY, amt,acno);
    	return count;
   }
    
}
