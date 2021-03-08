package com.vamshi.entity;

public class Employee {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	
	public Employee(int eno, String ename, float esal, String eaddr) {
		super();
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}
	
	public int getEno() {
		return eno;
	}
	public String getEname() {
		return ename;
	}
	public float getEsal() {
		return esal;
	}
	public String getEaddr() {
		return eaddr;
	}

	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}
	
	
	

}
