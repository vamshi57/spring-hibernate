package com.vamshi.aspect;

import java.io.FileWriter;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;

import org.aspectj.lang.JoinPoint;

public class TestDriveAdvice {
	private static Writer writer;
	
	public void testDrive(JoinPoint jp) {
		
		Object args[]=null;
		System.out.println("targer method details "+jp.getSignature()
		+" "+Arrays.deepToString(jp.getArgs()));
		//get target method arguments
		args=jp.getArgs();
		
		try {
			writer=new FileWriter("E:/auditLog.txt");
			writer.write(args[0]+" model car price :"+args[1]+"with color :"
			+args[2]+"through executive:"+ args[3]+" has come for test drive on"
			+new Date()+"");
			writer.flush();
			writer.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}//try catch
	}//method

}//class
