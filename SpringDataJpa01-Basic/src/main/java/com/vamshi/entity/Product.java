package com.vamshi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long pid;
	private String pname;
	private float price;
	
	public Product() {
			
		}
	
	public Product(String pname,float price) {
		this.pname=pname;
		this.price=price;
	}
   
	
	public Product(Long pid, String pname, float price) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", price=" + price + "]";
	}
}
