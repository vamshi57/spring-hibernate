package com.vamshi.service;

import com.vamshi.dao.BankDao;

public class BankMgmtServiceImpl implements BankMgmtService {
	private BankDao dao;
	
    public	BankMgmtServiceImpl(BankDao dao){
    	this.dao=dao;
		
	}
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
	   return count==0?"money not deposited ":" money is deposited from"+ acno+" account";
	}
   
}
