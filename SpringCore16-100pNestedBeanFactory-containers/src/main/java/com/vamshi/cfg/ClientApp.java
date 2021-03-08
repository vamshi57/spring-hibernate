package com.vamshi.cfg;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;


import com.vamshi.loan.BankLoanApprover;

public class ClientApp {
	
	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(Appconfig.class);
		BankLoanApprover approval=ctx.getBean("lb",BankLoanApprover.class);
	  	System.out.println(approval.approveLoan());
	      ((AbstractApplicationContext) ctx).close();	
	}

}
