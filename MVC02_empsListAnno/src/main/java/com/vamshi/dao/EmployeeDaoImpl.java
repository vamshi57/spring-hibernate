package com.vamshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.vamshi.beans.EmployeeBO;
@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final String  GET_ALL_EMPS="select * from emp";
	
	@Autowired
	private JdbcTemplate jt;

	
	@Override
	public List<EmployeeBO> getAllEmps() {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_ALL_EMPS, new EmployeeExtractor());
		System.out.println("after getallemp");
		return listBO;
	}
	
	//inner class
	private  class  EmployeeExtractor  implements ResultSetExtractor<List<EmployeeBO>>{

		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO=null;
			EmployeeBO bo=null;
			// copy ResultSet object records BO class objects and add them to List Collection
			listBO=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				//copy each record to BO class object
				bo=new EmployeeBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setDeptno(rs.getString(4));
				System.out.println(rs.getInt(1));
				//add each BO class object to List Collection
				listBO.add(bo);
			}//while
			
			return listBO;
		}//extractData(-)
		
	}//inner class
   
	
}
