package com.vamshi.dao;

public interface BankDao {

	public int withdraw(int acno,float amt);
	public int deposite(int acno,float amt);
	
}
