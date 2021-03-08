package com.vamshi.patterns;

public class PatternTwo {

	public static void main(String[] args) {
		String s="vamshi";
		StringBuffer br=new StringBuffer(s);
		StringBuffer sR=br.reverse();
		System.out.println(sR);
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(s.length()-i-1);
			System.out.print(ch);
			
		}
		
		
	}

}
