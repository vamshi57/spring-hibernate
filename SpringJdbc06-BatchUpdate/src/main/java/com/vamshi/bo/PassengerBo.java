package com.vamshi.bo;

public class PassengerBo {
	private String name;
	private String from;
	private String to;
	private int price;
	
	public PassengerBo() {
		
	}
	
	
	public PassengerBo(String name, String from, String to, int price) {
		this.name = name;
		this.from = from;
		this.to = to;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "PassengerDto [name=" + name + ", from=" + from + ", to=" + to + ", price=" + price + "]";
	}

}
