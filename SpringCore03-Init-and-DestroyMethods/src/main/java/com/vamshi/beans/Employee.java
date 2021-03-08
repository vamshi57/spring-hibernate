package com.vamshi.beans;

public class Employee {
	
	private String eno;
	private String ename;
	private String eaddr;
	private String esal;
	
	public Employee(String eno, String ename, String eaddr, String esal) {
		super();
		System.out.println("Employee.Employee()");
		
		this.eno = eno;
		this.ename = ename;
		this.eaddr = eaddr;
		this.esal = esal;
	}
	public String getEno() {
		System.out.println("Employee.getEno()");
		return eno;
	}
	public void setEno(String eno) {
		System.out.println("Employee.setEno()");
		this.eno = eno;
	}
	public String getEname() {
		System.out.println("Employee.getEname()");
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	public String getEsal() {
		return esal;
	}
	public void setEsal(String esal) {
		this.esal = esal;
	}
	public void myInitMethod() {
		System.out.println("Employee.myInitMethod()");
	}
	public void myDestroy()
	{
		System.out.println("Employee.myDestroy()");
	}
	@Override
	public String toString() {
		return "Employee [eno=" + eno + ", ename=" + ename + ", eaddr=" + eaddr + ", esal=" + esal + "]";
	}
	


}
