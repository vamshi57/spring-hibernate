package com.vamshi.dao;

import java.util.List;

import com.vamshi.bo.EmployeeBO;
import com.vamshi.rbo.EmployeeRBO;

public interface EmployeeDao {
	List<EmployeeRBO> getAllDetails(EmployeeBO bo);

}
