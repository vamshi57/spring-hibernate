package com.vamshi.model;

public class IExamResult {
	private int id;
	private int semester;
	private float percentage;
	private String dob;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "IExamResult [id=" + id + ", semester=" + semester + ", percentage=" + percentage + ", dob=" + dob + "]";
	}
	
	

}
