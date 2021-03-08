package com.vamshi.dao;

public interface BankDao {
	
	int withdraw(int sourceid,float amount);
	int deposite(int targetid,float amount);
}
