package com.vamshi;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Java10Var {
	
	
	public static void main(String[] args) {
       String s="vam,shi,kri,shna,vadla,konda,";
       char[] ch=s.toCharArray();
   
       for(char c : ch) {
    	   System.out.println(c+" ");
       }
       
       
		StringTokenizer s1=new StringTokenizer(s, ",");
		System.out.println(s1.countTokens());
		
		
		/*
		 * while(s1.hasMoreElements())
		 * {
		 * System.out.println(s1.nextToken());
		 * }
		 */
		List<String> list=new ArrayList<String>();
		 
		 
		String [] s2=s.split(",");
		for(String s3:s2) {
			System.out.println(s3);
		}
		
	}

}
