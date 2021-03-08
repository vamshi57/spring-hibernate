package com.vamshi.service;




import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.PassengerBo;
import com.vamshi.dao.RegistractionDao;
import com.vamshi.dto.PassengerDto;
@Service("service")
public class RegistractionServiceImpl implements RegistractionService {
	@Autowired
	private RegistractionDao dao;

	@Override
	public PassengerDto getPassengerService(String pname) {
		PassengerDto dto= new PassengerDto();
		PassengerBo bo;
		bo=dao.getPassenger(pname);
		BeanUtils.copyProperties(bo, dto);
		return dto;
	}

	

}
