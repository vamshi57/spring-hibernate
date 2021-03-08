package com.vamshi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vamshi.dto.EmployeeDTO;
@Service("empService")
public interface EmployeeService {
	List<EmployeeDTO> fetchEmpolyeeService(String eaddr);

}
