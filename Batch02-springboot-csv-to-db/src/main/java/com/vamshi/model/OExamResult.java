package com.vamshi.model;

import java.sql.Date;

public class OExamResult {
	private int id;
	private int semester;
	private float percentage;
	private Date dob;
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
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "OExamResult [id=" + id + ", semester=" + semester + ", percentage=" + percentage + ", dob=" + dob + "]";
	}
	
 

}
