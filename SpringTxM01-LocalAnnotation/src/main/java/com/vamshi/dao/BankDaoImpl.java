package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BankDaoImpl implements BankDao {
	private static final String WITHDRAW="update bank_account set balance=balance-? where accno=?";
	private static final String DEPOSITE="update bank_account set balance=balance+? where accno=?";
	 @Autowired
	private JdbcTemplate jt;
	 
	@Override
	public int withdraw(int sourceid, float amount) {
	int count=0;
	count=jt.update(WITHDRAW,amount,sourceid);
		return count;
	}
	@Override
	public int deposite(int targetid, float amount) {
		int count=0;
		count=jt.update(DEPOSITE,amount,targetid);
			return count;
	}

	

}
