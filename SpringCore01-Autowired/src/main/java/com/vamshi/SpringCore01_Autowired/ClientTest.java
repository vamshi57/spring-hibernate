package com.vamshi.SpringCore01_Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vamshi.travel.TravelAgent;

public class ClientTest {

	public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
				TravelAgent agent=context.getBean("ta",TravelAgent.class);
			System.out.println(agent.toString());
				

			}


}
