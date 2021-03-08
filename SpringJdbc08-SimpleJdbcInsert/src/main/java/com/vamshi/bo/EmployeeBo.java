package com.vamshi.bo;

public class EmployeeBo {
	private int eno;
	private String ename;
	private float esal;
	private String eaddr;
	
	public EmployeeBo() {
		
	}
	
	public EmployeeBo(int eno, String ename, float esal, String eaddr) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}
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
		this.ename = ename;
	}
	public float getEsal() {
		return esal;
	}
	public void setEsal(float esal) {
		this.esal = esal;
	}
	public String getEaddr() {
		return eaddr;
	}
	public void setEaddr(String eaddr) {
		this.eaddr = eaddr;
	}
	@Override
	public String toString() {
		return "EmployeeBo [eno=" + eno + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
	}
	

}
