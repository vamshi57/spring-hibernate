package com.vamshi.cfg;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.vamshi.loan.BankLoanApprover;

public class ClientApp {
	
	public static void main(String[] args) {
		BeanFactory pfactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/vamshi/cfg/loan-beans.xml"));
		
		BeanFactory cfactory=new XmlBeanFactory(new FileSystemResource("src/main/java/com/vamshi/cfg/approval-beans.xml"),pfactory);
		
		BankLoanApprover approval=cfactory.getBean("id",BankLoanApprover.class);
		System.out.println(approval.approveLoan());
		
	}

}
