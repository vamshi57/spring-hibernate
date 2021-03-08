package com.vamshi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class App 
{
	 public App() {
		 Connection con=null;
		 Statement st=null;
		 ResultSet rs=null;
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 con=DriverManager.getConnection("jdbc:mysql://localhost:3306/emp1", "root", "root");
			 st=con.createStatement();
			 rs=st.executeQuery("select * from emp1");
			 while(rs.next()) {
				 System.out.println("  "+rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3)+"  "+rs.getString(4));
			 }	 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 finally {
			 try {
			 con.close();
		 }
			 catch(Exception e) {
				 e.printStackTrace();
			 }
	   }
		 
	 }
   
}
