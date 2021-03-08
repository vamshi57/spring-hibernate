package com.vamshi.service;

import org.springframework.stereotype.Service;

import com.vamshi.dto.EmployeeDTO;
@Service("empService")
public interface EmployeeService {
	EmployeeDTO fetchEmpolyeeService(int eno);

}
