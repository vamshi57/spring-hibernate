package com.vamshi.dao;

import java.util.List;

import com.vamshi.bo.EmployeeBO;

public interface EmployeeDao {
	List<EmployeeBO> fetchEmo(String eaddr);
}
