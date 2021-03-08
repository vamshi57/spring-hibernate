package com.vamshi.dto;

public class ProductDto {
	
	private int pid;
	private String pname;
	private Float price;
	private Float qty;
	
	
	
	public ProductDto(int pid, String pname, Float price, Float qty) {
		
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.qty = qty;
	}
	
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		this.price = price;
	}
	public Float getQty() {
		return qty;
	}
	public void setQty(Float qty) {
		this.qty = qty;
	}
	
	
	@Override
	public String toString() {
		return "ProductDto [pid=" + pid + ", pname=" + pname + ", price=" + price + ", qty=" + qty + "]";
	}
	
	
	
	

}
