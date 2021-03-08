package com.vamshi.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.EmployeeBo;
@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SimpleJdbcInsert sji;

	@Override
	public int getInsertDao(EmployeeBo bo) {
		int count=0;
		BeanPropertySqlParameterSource bpsps;
		sji.setTableName("emp1");
		bpsps=new BeanPropertySqlParameterSource(bo);
		count=sji.execute(bpsps);
		return count;
	}

}
