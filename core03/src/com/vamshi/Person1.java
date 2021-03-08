package com.vamshi;
public  class Person1{
	
	private  String name;
	private int  age;
	private  String location;
	
	public Person1(String name, int age, String location) {
		this.name = name;
		this.age = age;
		this.location = location;
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

	@Override
	public String toString() {
		return "Person1 [name=" + name + ", age=" + age + ", location=" + location + "]";
	}		
}