package com.vamshi.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vamshi.bo.EmployeeBO;
import com.vamshi.dao.EmployeeDao;
import com.vamshi.dto.EmployeeDTO;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
    private EmployeeDao dao;
	

	public EmployeeDTO fetchEmpolyeeService(int eno) {
	    EmployeeBO bo=dao.fetchEmo(eno);
	    EmployeeDTO dto=new EmployeeDTO();
	    BeanUtils.copyProperties(bo, dto);
		return dto;
	}

}
