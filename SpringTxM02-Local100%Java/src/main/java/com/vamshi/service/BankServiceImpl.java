package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vamshi.dao.BankDao;


@Service("bankService")
@Transactional(propagation = Propagation.REQUIRED)
public final class BankServiceImpl implements BankService {
	
	@Autowired
	private BankDao dao;

	@Override
	public String transaction(int sourceid, int targetid, float amount) {
		int count1=dao.withdraw(sourceid, amount);
		int count2=dao.deposite(targetid, amount);
		if(count1!=count2||count1==0||count2==0){
			throw new RuntimeException("transaction failed");
		}
		return "transaction succeed";
	}
	

}
