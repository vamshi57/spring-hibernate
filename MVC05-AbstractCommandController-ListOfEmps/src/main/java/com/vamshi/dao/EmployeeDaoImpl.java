package com.vamshi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.vamshi.bo.EmployeeBO;
import com.vamshi.rbo.EmployeeRBO;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jt;
	
	private static final String EMP_SEARCH_QUERY="select eno,ename,esal,deptno,addr from emp1 "
	+"where(eno is not null and eno=?)"+"or(ename is not null and ename like ?)"
			+"or(esal is not null and esal>?)";

	
	
	public List<EmployeeRBO> getAllDetails(EmployeeBO bo){
		List<EmployeeRBO> listRBO=null;
		listRBO=jt.query(EMP_SEARCH_QUERY, rs->{ 
			                                List<EmployeeRBO> listRBO1=new ArrayList<EmployeeRBO>();
			                               EmployeeRBO rbo=null;
			                                     while(rs.next()) {
				                                    rbo=new EmployeeRBO();
				                                    rbo.setEno(rs.getInt(1));
			                                      	rbo.setEname(rs.getString(2));
                                    				rbo.setEsal(rs.getFloat(3));
                                    				rbo.setDeptno(rs.getInt(4));
	                                     			rbo.setAddr(rs.getString(5));
			                                       	listRBO1.add(rbo);			
			                                      }
			                                  return listRBO1;
			
		                          },bo.getEno(),bo.getEname(),bo.getEsal());
		
		
	  return listRBO ;
     }
}
