package com.vamshi.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import org.springframework.stereotype.Repository;


@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SimpleJdbcCall sjc;

	@Override
	public int foundEmpDao(int eno) {
		sjc.setProcedureName("procedure_emp1");
		Map<String,Object> inParam=new HashMap<String, Object>();
		inParam.put("eid", eno);
		Map<String, Object> outParam=sjc.execute(inParam);
		System.out.println(outParam.get("result"));
		int count=(int)outParam.get("result");
		System.out.println(count);
		return count;
	}

	

}
