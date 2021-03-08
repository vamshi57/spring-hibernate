package com.vamshi.command;

public class EmployeeCmd {
	private int eno;
	private String ename;
	private float esal;
	
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getEname() {
		
		return ename;
	}
	public void setEname(String ename) {
		System.out.println(ename);
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		System.out.println(esal);
		this.esal = esal;
	}
	
	

}
