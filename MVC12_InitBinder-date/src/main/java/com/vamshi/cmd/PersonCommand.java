package com.vamshi.cmd;

import java.util.Arrays;
import java.util.Date;

public class PersonCommand {
	private String name;
	private int age;
	private String gender="femal";
	private String hobies[]= {"watchingTV","meditation"};
	private String courses[]= {"java","oracle"};
	private String qlf="MCA";
	private Date dob,doj,dom;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String[] getHobies() {
		return hobies;
	}
	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	}
	public String[] getCourses() {
		return courses;
	}
	public void setCourses(String[] courses) {
		this.courses = courses;
	}
	public String getQlf() {
		return qlf;
	}
	public void setQlf(String qlf) {
		this.qlf = qlf;
	}
	public Date getDob() {
		return dob;
	}
	public Date getDoj() {
		return doj;
	}
	public Date getDom() {
		return dom;
	}
	@Override
	public String toString() {
		return "PersonCommand [name=" + name + ", age=" + age + ", gender=" + gender + ", hobies="
				+ Arrays.toString(hobies) + ", courses=" + Arrays.toString(courses) + ", qlf=" + qlf + ", dob=" + dob
				+ ", doj=" + doj + ", dom=" + dom + "]";
	}
	
}
