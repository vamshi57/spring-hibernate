package com.vamshi.dao;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.vamshi.bo.EmployeeBO;



@Repository("dao")
public class EmployeeDaoImpl1 implements EmployeeDao{
	private static final String Query="select eno,ename,esal,eaddr from emp1 where eaddr=?"; 
@Autowired
 private JdbcTemplate jt;

	public List<EmployeeBO> fetchEmo(String eaddr) {
		
		List<EmployeeBO> listbo=jt.query(Query, (rs)->{
			List<EmployeeBO> listbo1=null;
			EmployeeBO bo1=null;
			listbo1=new ArrayList<>();
			while(rs.next()) {
				bo1=new EmployeeBO();
				bo1.setEno(rs.getInt(1));
				bo1.setEname(rs.getString(2));
				bo1.setEsal(rs.getFloat(3));
				bo1.setEaddr(rs.getString(4));
				listbo1.add(bo1);	
			}
			return listbo1;	
		}, eaddr);
		
				
             return listbo;
		}

	
	}
	


