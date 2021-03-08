package com.vamshi.entities;

public class DTO {
	
	
	private String sname;
	private int mark1;
	private int mark2;
	private int mark3;
	
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getMark1() {
		return mark1;
	}
	public void setMark1(int mark1) {
		this.mark1 = mark1;
	}
	public int getMark2() {
		return mark2;
	}
	public void setMark2(int mark2) {
		this.mark2 = mark2;
	}
	public int getMark3() {
		return mark3;
	}
	public void setMark3(int mark3) {
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "DTO [ sname=" + sname + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3
				+ "]";
	}
	
	
	

}
