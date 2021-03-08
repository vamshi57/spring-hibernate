package com.vamshi.beans;

public class EmployeeDTO {
	private int srno;
	private int eid;
	private String ename;
	private String job;
	private String deptno;
	
	
	
	public int getSrno() {
		return srno;
	}
	public void setSrno(int srno) {
		this.srno = srno;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDeptno() {
		return deptno;
	}
	public void setDeptno(String deptno) {
		this.deptno = deptno;
	}
	@Override
	public String toString() {
		return "EmployeeDTO [srno=" + srno + ", eid=" + eid + ", ename=" + ename + ", job=" + job + ", deptno=" + deptno
				+ "]";
	}
	

}
