package com.vamshi.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.vamshi.beans.EmployeeBO;

public class EmployeeDaoImpl implements EmployeeDao {

	private static final String  GET_ALL_EMPS="select * from emp where (eid=101) or (ename='ram')";
	private JdbcTemplate jt;

	public EmployeeDaoImpl(JdbcTemplate jt) {
			this.jt = jt;
			System.out.println("after jt");
	}
	@Override
	public List<EmployeeBO> getAllEmps() {
		List<EmployeeBO> listBO=null;
		listBO=jt.query(GET_ALL_EMPS, new EmployeeExtractor());
		System.out.println("after getallemp");
		return listBO;
	}
	
	private  class  EmployeeExtractor  implements ResultSetExtractor<List<EmployeeBO>>{
		@Override
		public List<EmployeeBO> extractData(ResultSet rs) throws SQLException, DataAccessException {
			List<EmployeeBO> listBO=null;
			EmployeeBO bo=null;
			listBO=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				bo=new EmployeeBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setDeptno(rs.getString(4));
				System.out.println(rs.getInt(1));
				listBO.add(bo);
			}//close of while loop
			return listBO;
		}//close of method
	}//close of innerclass
}//outer class
