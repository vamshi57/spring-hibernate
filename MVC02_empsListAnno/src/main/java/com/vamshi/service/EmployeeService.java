package com.vamshi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vamshi.beans.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> fetchAllEmps();
}
