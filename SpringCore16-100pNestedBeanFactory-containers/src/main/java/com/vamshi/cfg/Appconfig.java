package com.vamshi.cfg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.vamshi.loan.LoanDetails;

@Configuration
@ComponentScan(basePackages = "com.vamshi.loan")
public class Appconfig {
	
	@Bean(name = "loan")
	public LoanDetails getLD() {
	LoanDetails ld=new LoanDetails();
	ld.setLoanId(101);
	ld.setLoanType("car");
	ld.setCustomerName("vamshi");
		return ld;
	}
	
	

}
