package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("withdrawdao")
public class WithdrawDaoImpl implements WithdrawDao {
	private static final String WITHDRAW="update bank_account set balance=balance-? where accno=?";
	
	@Autowired
	@Qualifier("mysqljt")
	private JdbcTemplate jt;

	@Override
	public boolean withdraw(int accno, float amt) {
		
		int cnt=jt.update(WITHDRAW,amt,accno);
		System.out.println("WithdrawDaoImpl.withdraw() :"+cnt);
		return cnt==1?true:false;
	}
	
	

}
