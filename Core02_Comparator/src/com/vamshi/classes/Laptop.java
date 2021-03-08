package com.vamshi.classes;

public class Laptop {
	private String lapname;
	private int price;
	
	public Laptop(String lapname, int price) {
		super();
		this.lapname = lapname;
		this.price = price;
	}
	public void setLapname(String lapname) {
		this.lapname = lapname;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getLapname() {
		return lapname;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Laptop [lapname=" + lapname + ", price=" + price + "]";
	}
	
    
	

}
