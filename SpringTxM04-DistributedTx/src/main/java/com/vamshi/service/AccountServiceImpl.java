package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.vamshi.dao.DepositeDao;
import com.vamshi.dao.WithdrawDao;

@Service("service")
@Transactional(propagation = Propagation.REQUIRED)
public class AccountServiceImpl implements AccountService {

	@Autowired
	private DepositeDao depositeDao;
	@Autowired
	private WithdrawDao withdrawDao;
	@Override
	public boolean transferMoney(int srcAno, int destAno, float amt) {
		boolean rs1=withdrawDao.withdraw(srcAno, amt);
		boolean rs2=depositeDao.deposite(destAno, amt);
		System.out.println("AccountServiceImpl.transferMoney()");
		if(rs1==false||rs2==false) {
			System.out.println("AccountServiceImpl.transferMoney()");
			
			throw new RuntimeException("Money transcation failed");
		}
		return true;
	}
	
	
	

}
