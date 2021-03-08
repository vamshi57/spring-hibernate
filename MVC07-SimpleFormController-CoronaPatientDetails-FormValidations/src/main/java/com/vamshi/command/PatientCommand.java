package com.vamshi.command;

public class PatientCommand {
	private String name;
	private int age;
	private String location;
	private String hospital;
	
	
	public PatientCommand() {
		System.out.println("PatientCommand.PatientCommand()");
	}
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
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getHospital() {
		return hospital;
	}
	public void setHospital(String hospital) {
		this.hospital = hospital;
	}

}
