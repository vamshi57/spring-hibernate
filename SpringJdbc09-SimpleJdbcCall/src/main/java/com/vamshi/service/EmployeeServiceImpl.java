package com.vamshi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vamshi.dao.EmployeeDao;
@Service("service")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public String getInsertService(int eno) {
		int i=dao.foundEmpDao(eno);
		System.out.println(i);
		return i>=1?"the given record id found":"the  given id not found";
	}
	
	
}
