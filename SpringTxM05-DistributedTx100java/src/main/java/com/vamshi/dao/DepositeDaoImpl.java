package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("depositedao")
public class DepositeDaoImpl implements DepositeDao {
  private static final String DEPOSITE="update bank_account set balance=balance+? where accno=?";
	@Autowired
	@Qualifier("orajt")
	private JdbcTemplate jt;
	
	@Override
	public boolean deposite(int accno, float amt) {
		
		int cnt=jt.update(DEPOSITE,amt,accno);
		System.out.println("DepositeDaoImpl.deposite() :"+cnt);
		
		return cnt==1?true:false;
	}

}
