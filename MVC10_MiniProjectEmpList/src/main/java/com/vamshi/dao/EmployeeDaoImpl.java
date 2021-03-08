package com.vamshi.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import com.vamshi.beans.EmployeeBO;


@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	private static final String  GET_ALL_EMPS="select * from emp";
	private static final String  GET_EMP_BY_EID="select eid,ename,job,deptno from emp where eid=?";
	private static final String  UPDATE_BY_EID="update emp set ename=?,job=?,deptno=? where eid=?";
    private static final String  DELECT_BY_EID="delete from emp where eid=?";
	@Autowired
	private JdbcTemplate jt;

	
	@Override
	public List<EmployeeBO> getAllEmps() {
		List<EmployeeBO> listBO=null;
	
	listBO=jt.query(GET_ALL_EMPS,rs->{
		
			List<EmployeeBO> listBO1=null;
			EmployeeBO bo=null;
			// copy ResultSet object records BO class objects and add them to List Collection
			listBO1=new ArrayList<EmployeeBO>();
			while(rs.next()) {
				//copy each record to BO class object
				bo=new EmployeeBO();
				bo.setEid(rs.getInt(1));
				bo.setEname(rs.getString(2));
				bo.setJob(rs.getString(3));
				bo.setDeptno(rs.getString(4));
				System.out.println(rs.getInt(1));
				//add each BO class object to List Collection
				listBO1.add(bo);
			}//while
			return listBO1;	
		});
		System.out.println("after getallemp");
		return listBO;
	}
	//for getting values
	@Override
	public EmployeeBO getEmpById(int eid) {
		EmployeeBO bo=null;
		bo=jt.queryForObject( GET_EMP_BY_EID,(rs,index)->{
			EmployeeBO bo1=null;
			bo1=new EmployeeBO();
			bo1.setEid(rs.getInt(1));
			bo1.setEname(rs.getString(2));
			bo1.setJob(rs.getString(3));
			bo1.setDeptno(rs.getString(4));
			
			return bo1;			
		},eid);
		System.out.println("EmployeeDaoImpl.getEmpById()");
		return bo;
	}
	
	//updating values in table
	public int updateEmp(EmployeeBO bo) {
		int count=0;
		System.out.println("EmployeeDaoImpl.updateEmp()"+bo.getEid()+"  "+bo.getEname()+" "+bo.getJob());
		count=jt.update(UPDATE_BY_EID,bo.getEname(),bo.getJob(),bo.getDeptno(),bo.getEid());
		System.out.println(count);
     return count;		
	}
	
	public int deleteEmpByEid(int eid) {
		int count=0;
	    count= jt.update(DELECT_BY_EID, eid);
		return count;
	}
	
	
	
	
}
