package com.vamshi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vamshi.beans.EmployeeDTO;

public interface EmployeeService {
	public List<EmployeeDTO> fetchAllEmps();
	public EmployeeDTO fetchEmpById(int eid);
	public String updateEmpServe(EmployeeDTO dto);
	public String deleteEmpService(int eid);
}
