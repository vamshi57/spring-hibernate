package com.vamshi.entities;

public class VO {
	private String sname,mark1,mark2,mark3;

	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getMark1() {
		return mark1;
	}
	public void setMark1(String mark1) {
		this.mark1 = mark1;
	}
	public String getMark2() {
		return mark2;
	}
	public void setMark2(String mark2) {
		this.mark2 = mark2;
	}

	public String getMark3() {
		return mark3;
	}

	public void setMark3(String mark3) {
		this.mark3 = mark3;
	}
	@Override
	public String toString() {
		return "VO [sname=" + sname + ", mark1=" + mark1 + ", mark2=" + mark2 + ", mark3=" + mark3 + "]";
	}
	

}
