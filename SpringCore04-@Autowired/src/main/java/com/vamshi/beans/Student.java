package com.vamshi.beans;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String sname;
	private String sid;
	
	//@Autowired	
	private Course course;
	
	//@Autowired
	private Date doj;
	
	@Autowired
	public Student(@Qualifier("course")Course course,@Qualifier("date") Date date) {
		this.course=course;
		this.doj=date;
	}
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		
		this.sname = sname;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	
	//@Autowired
	public void settingValue(Course course1) {
		
		this.course=course1;
    }
	
	@Override
	public String toString() {
		return "Student [sname=" + sname + ", sid=" + sid + ", course=" + course + ", doj=" + doj + "]";
	}
	
	
	

}
