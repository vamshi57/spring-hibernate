package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.dao.BankDao;
@Service("bankService")
public class BankMgmtServiceImpl implements BankMgmtService {
	@Autowired
	private BankDao dao;
		
	    @Override
    	public String withdrawMoney(int acno, float amt) {
    	int count=0;
    	count =dao.withdraw(acno, amt);
    	return count==0?"money not withdrawn  ": amt+"money is withdrawn from"+  acno+" account ";
    	}
	   @Override
		public String depositeMoney(int acno, float amt) {
		   int count=0;
		   count=dao.deposite(acno, amt);
		   System.out.println("BankMgmtServiceImpl.depositeMoney()");
		   System.out.println(count);
		   return count==0?"money not deposited ":" money is deposited from"+ acno+" account";
		}
   
}
