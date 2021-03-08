package com.vamshi.dao;

import java.util.List;

import com.vamshi.bo.AccountBo;

public interface BankDao {
    AccountBo getAccountByAccNo(int accNo);
	List<AccountBo> getAccountByBalanceRang(float start,float end);
    int updateByBalance(float increment,float start,float end);

}
