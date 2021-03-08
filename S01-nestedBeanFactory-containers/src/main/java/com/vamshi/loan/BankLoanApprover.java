package com.vamshi.loan;

public class BankLoanApprover {
  private LoanDetails details;
  public BankLoanApprover() {
	  System.out.println("BankLoanApprover.BankLoanApprover()");
  }
  public void setDetails(LoanDetails details) {
	  this.details = details;
   }
   @Override
   public String toString() {
	 return "BankLoanApprover [details=" + details + "]";
  }
  public String approveLoan() {
	  return this.toString()+"";
  }
  
  
}
