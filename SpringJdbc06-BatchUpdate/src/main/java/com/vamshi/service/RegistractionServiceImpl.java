package com.vamshi.service;

import java.util.ArrayList;
import java.util.List;

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
	public String batchinsert(List<PassengerDto> listDto) {
		List<PassengerBo> listBo=new ArrayList<>();
		listDto.forEach(dto->{
			PassengerBo bo=new PassengerBo();
			BeanUtils.copyProperties(dto, bo);
			listBo.add(bo);	
		});
		int[] a=dao.batchInsert(listBo);
		if(a!=null) 
			return "successfully inserted";
		
		return "failed insertion";
	}

}
