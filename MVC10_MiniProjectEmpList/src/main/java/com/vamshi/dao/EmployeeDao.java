package com.vamshi.dao;

import java.util.List;

import com.vamshi.beans.EmployeeBO;

public interface EmployeeDao {
	public List<EmployeeBO> getAllEmps();
	public EmployeeBO getEmpById(int eid);
	public int updateEmp(EmployeeBO bo);
	public int deleteEmpByEid(int eid);
}
