package com.vamshi.service;

import java.util.List;

import com.vamshi.dto.EmployeeDTO;

public interface EmployeeService {
	public int getPagesCount(int pageSize);
	public List<EmployeeDTO> getPageData(int pageNo,int pageSize);
}
