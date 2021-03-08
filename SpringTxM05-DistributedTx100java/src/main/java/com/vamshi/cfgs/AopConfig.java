package com.vamshi.cfgs;

import javax.transaction.SystemException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;

@Configuration
@EnableTransactionManagement
public class AopConfig {
	
	@Bean
	public UserTransactionImp getUserTximp() throws SystemException{
		UserTransactionImp userTximpl=new UserTransactionImp(); 
		userTximpl.setTransactionTimeout(60);
		return userTximpl;
	}
	@Bean
	public UserTransactionManager getTXM() {
		UserTransactionManager txm=new UserTransactionManager();
		txm.setForceShutdown(true);		
		return txm;
	}
	
	@Bean(value = "dtxmgr")
	public JtaTransactionManager getJtTxm() throws SystemException{
		JtaTransactionManager jtTxm=new JtaTransactionManager();
		jtTxm.setUserTransaction(getUserTximp());
	    jtTxm.setTransactionManager(getTXM());	
		return jtTxm;
	}

}
