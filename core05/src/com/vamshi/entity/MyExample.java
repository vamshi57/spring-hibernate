package com.vamshi.entity;

public class MyExample 
{
	private int i;
	private int j;
	
	public MyExample(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	@Override
	public String toString() {
		return "[i=" + i + ", j=" + j + "]";
	}
	

}
