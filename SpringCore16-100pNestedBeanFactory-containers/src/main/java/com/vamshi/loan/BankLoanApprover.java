package com.vamshi.loan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("lb")
public class BankLoanApprover {
	
  @Autowired
  @Qualifier("loan")
  private LoanDetails details;
  
  public BankLoanApprover() {
	  System.out.println("BankLoanApprover.BankLoanApprover()");
  }
 
   @Override
   public String toString() {
	 return "BankLoanApprover [details=" + details + "]";
  }
  public String approveLoan() {
	  return this.toString()+"";
  }
  
  
}
