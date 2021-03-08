package com.vamshi.bo;

public class AccountBo {
	private int accNo;
	private String accHolderName;
	private Float balance;
	
	public AccountBo() {
		
	}
	public AccountBo(int accNo, String accHolderName, Float balance) {
	
		this.accNo = accNo;
		this.accHolderName = accHolderName;
		this.balance = balance;
	}
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccHolderName() {
		return accHolderName;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	public Float getBalance() {
		return balance;
	}
	public void setBalance(Float balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountBo [accNo=" + accNo + ", accHolderName=" + accHolderName + ", balance=" + balance + "]";
	}
	
	
	 

}
