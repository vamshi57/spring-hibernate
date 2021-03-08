package com.vamshi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.vamshi.entities.DTO;

@Repository("dao")
@Profile("test")
// for oracle db
public class StudentDaoImpl implements StudentDao {
	private static final String INSERT_QUERY="insert into student1(sno,sname,mark1,mark2,mark3) values(sno_seq.NEXTVAL,?,?,?,?)";
	private static final String RETRIVE_QUERY="select sno,sname,mark1,mark2,mark3 from student1 where sname=?";
	@Autowired
	private DataSource ds;

	@Override
	public void insertInTo(DTO dto) throws Exception{
		Connection con=null;
		PreparedStatement pst=null;
		
		ResultSet rs=null;
		
	con =ds.getConnection();
	System.out.println("before insert");
	pst=con.prepareStatement(INSERT_QUERY);
	System.out.println("insertquesry");
	pst.setString(1, dto.getSname());
	pst.setInt(2, dto.getMark1());
	pst.setInt(3, dto.getMark2());
	pst.setInt(4, dto.getMark3());
	int b=pst.executeUpdate();
	System.out.println(b);
	
	System.out.println("after insert");
	pst=con.prepareStatement(RETRIVE_QUERY);

	pst.setString(1, dto.getSname());
	System.out.println("setting pstname");
	rs=pst.executeQuery();
	
	System.out.println("retrive");
	while(rs.next()) {
	     String s=rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+""+rs.getInt(4)+" "+rs.getInt(5);
	    System.out.println(s);
	}
	pst.close();
	System.out.println("StudentDaoImpl.insertInTo()");
	
	
	
	}
	

}
