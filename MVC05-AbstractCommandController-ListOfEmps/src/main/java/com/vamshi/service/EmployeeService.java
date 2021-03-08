package com.vamshi.service;

import java.util.List;

import com.vamshi.dto.EmployeeDTO;
import com.vamshi.rdto.EmployeeRDTO;

public interface EmployeeService {
	public List<EmployeeRDTO> getAllEmpl(EmployeeDTO dto);

}
