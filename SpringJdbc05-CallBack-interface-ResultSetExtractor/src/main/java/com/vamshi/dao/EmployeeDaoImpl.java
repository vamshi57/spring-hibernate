package com.vamshi.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.EmployeeBO;



//@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao{
	private static final String Query="select eno,ename,esal,eaddr from emp1 where eaddr=?"; 
@Autowired
 private JdbcTemplate jt;

	public List<EmployeeBO> fetchEmo(String eaddr) {
		List<EmployeeBO>listbo=new ArrayList<>();
		
		
		jt.query(Query, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				EmployeeBO bo=new EmployeeBO();
				bo.setEno(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setEsal(rs.getFloat(3));
				bo.setEaddr(rs.getString(4));
			listbo.add(bo);
				
			}
		}, eaddr);
		
				
             return listbo;
		}

	
	}
	


