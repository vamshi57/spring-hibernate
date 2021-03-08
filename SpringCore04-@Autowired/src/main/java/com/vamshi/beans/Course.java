package com.vamshi.beans;

public class Course {
	private int id;
	private String name;
	private int fee;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", fee=" + fee + "]";
	}
	

}
