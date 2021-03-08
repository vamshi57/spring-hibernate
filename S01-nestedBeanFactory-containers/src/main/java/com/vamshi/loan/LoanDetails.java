package com.vamshi.loan;

public class LoanDetails {
	private int loanId;
	private String loanType;
	private String customerName;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public String getLoanType() {
		return loanType;
	}
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "LoanDetails [loanId=" + loanId + ", loanType=" + loanType + ", customerName=" + customerName + "]";
	}
	

}
