package com.vamshi.service;

import java.util.List;

import com.vamshi.bo.AccountBo;
import com.vamshi.dto.AccountDto;

public interface BankService {
	AccountDto getAccountByAccNoService(int accNo);
	List<AccountDto> getAccountByBalanceRangService(float start,float end);
    int updateByBalanceService(float increment,float start,float end);
}
