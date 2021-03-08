package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.AccountBo;
import com.vamshi.dao.BankDao;
import com.vamshi.dto.AccountDto;

@Service("service")
public class BankServiceImpl implements BankService {
	@Autowired
	private BankDao dao;

	public AccountDto getAccountByAccNoService(int accNo) {
		AccountDto dto=new AccountDto();
		 AccountBo bo=dao.getAccountByAccNo(accNo);
		 BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	public List<AccountDto> getAccountByBalanceRangService(float start, float end) {
		List<AccountBo> listbo=dao.getAccountByBalanceRang(start, end);
		List<AccountDto> listdto=new ArrayList<>();
		
		listbo.forEach(bo->{
			AccountDto dto=new AccountDto();
			BeanUtils.copyProperties(bo, dto);
			listdto.add(dto);
		});
		
		return listdto;
	}

	@Override
	public int updateByBalanceService(float increment, float start, float end) {
		int updatedRows=dao.updateByBalance(increment, start, end);
		return updatedRows;
	}
	

}
