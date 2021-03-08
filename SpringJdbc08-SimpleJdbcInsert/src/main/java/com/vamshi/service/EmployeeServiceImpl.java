package com.vamshi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.EmployeeBo;
import com.vamshi.dao.EmployeeDao;
import com.vamshi.dto.EmployeeDto;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;
	
    @Override
	public String getInsertService(EmployeeDto dto) {
		int count=0;
		EmployeeBo bo=new EmployeeBo();
		BeanUtils.copyProperties(dto, bo);
		count=dao.getInsertDao(bo);
		return count==0?"insertion Failed":"Insertion Succeded";
	}

	
}
