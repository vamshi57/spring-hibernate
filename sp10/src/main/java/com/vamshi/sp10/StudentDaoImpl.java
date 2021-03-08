package com.vamshi.sp10;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import com.vamshi.object_class.StudentBO;

public class StudentDaoImpl implements StudentDao {
	private static final String STUDENT_INSERT_QUERY="INSERT INTO STUDENT VALUES(?,?,?,?,?)";  
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	public int insert(StudentBO bo) {
		//write jdbc code to insert record
		try {
			//get jdbc con
			Connection con=ds.getConnection();
			PreparedStatement pst=con.prepareStatement(STUDENT_INSERT_QUERY);
			pst.setInt(1,bo.getSno());
			pst.setString(2,bo.getSname());
			pst.setInt(3, bo.getTotal());
			pst.setFloat(4,bo.getAvg());
			pst.setString(5,bo.getResult());
			
			//execute the Query
			int result=pst.executeUpdate();
			return result;
			
			
			}catch(Exception e) {
			e.printStackTrace();
			return 0;
		}
		
		
		
	}//method
	public StudentBO retrive(int sno) {
	try {
		Connection con=ds.getConnection();
		Statement st=con.createStatement();
		System.out.println("before executeQuery");
		ResultSet rs=st.executeQuery("select * from Student where sno="+sno+";");
	    System.out.println("after executeQuery");
		StudentBO bo=new StudentBO();
		 
		bo.setSno(sno);
		while(rs.next()) {
		 System.out.println(rs.getString(2));
		bo.setSname(rs.getString(2));
		 System.out.println("after executeQuery");
		bo.setResult(rs.getString(5));
		 System.out.println("after executeQuery");
		bo.setAvg(rs.getFloat(4));
		 System.out.println("after executeQuery");
		bo.setTotal(rs.getInt(3));
		 System.out.println("after executeQuery");
		}
		return bo;
	}catch(Exception e){
		e.printStackTrace();
		return null; 
		
	}
}

}//class
