package com.vamshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.vamshi.bo.EmployeeBO;



@Repository("dao")
public class EmployeeDaoImpl implements EmployeeDao{
	private static final String Query="select eno,ename,esal,eaddr from emp1 where eno=?"; 
@Autowired
 private JdbcTemplate jt;

	public EmployeeBO fetchEmo(int eno) {
		EmployeeBO bo1=jt.queryForObject(Query, /*(rs,index)->{
			EmployeeBO bo=null;
		     bo=new EmployeeBO();
		     bo.setEno(rs.getInt(1));
		     bo.setEname(rs.getString(2));
		     bo.setEsal(rs.getFloat(3));
		     bo.setEaddr(rs.getString(4));
			return bo;
		}*/new BeanPropertyRowMapper<EmployeeBO>(EmployeeBO.class) , eno);
				
             return bo1;
		}

	/*class EmployeeRowMapper implements RowMapper<EmployeeBO>{

		public EmployeeBO mapRow(ResultSet rs, int rowNum) throws SQLException {
		     EmployeeBO bo=null;
		     bo=new EmployeeBO();
		     bo.setEno(rs.getInt(1));
		     bo.setEname(rs.getString(2));
		     bo.setEsal(rs.getFloat(3));
		     bo.setEaddr(rs.getString(4));
			return bo;
		}*/
	}
	


