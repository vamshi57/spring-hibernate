package com.vamshi.service;

import java.util.Arrays;
import java.util.Date;
import java.util.Random;

import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
@Service("purchaseService")
public class PurchaseServiceImpl implements PurchaseService {
	@Autowired
	private JavaMailSender sender;

	@Override
	public String purchase(String[] item, float[] prices, String toMail)throws Exception {
	 float total=0.0f;
	 for(int i=0;i<prices.length;++i) {
		 total=total+prices[i];
	 }
	 String msg=Arrays.toString(item)+" are purchased having bil amount "+total+"with order id"+new Random().nextInt(1000);
	 System.out.println("before sendmail");
	 return sendEmail(msg,toMail);
	}
	
	
	
	
	
	private String sendEmail(String msg,String toMail)throws Exception {
		MimeMessageHelper helper=null;
		MimeMessage message=null;
		message=sender.createMimeMessage();
		helper=new MimeMessageHelper(message,true);
		
		
		//-----------------------------------------------
		//sender set from "vamshikrishnvadalkonda@gmail.com"
		helper.setFrom(new InternetAddress("vvkvrk57@gmail.com"));
		helper.setTo(new InternetAddress(toMail));
		//-----------------------------------------------
		
		
		//body----------------------------------
		helper.setSubject("open it to know it");
	   helper.setText(msg);
	   helper.setSentDate(new Date());
	   helper.addAttachment("vamshi.jpg",new ClassPathResource("vamshi.jpg"));
	   sender.send(message);
	   System.out.print("mail has been delivered");
		
		return "mail has been delivered";
		
	}

}
