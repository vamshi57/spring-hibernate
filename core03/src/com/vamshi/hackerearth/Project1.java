package com.vamshi.hackerearth;

import java.util.Scanner;

public class Project1 {
	
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.print("enter numbers  :");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(" entered numbers  :"+a+" "+b);
		long sum=0;
		for(int i=a;i<=b;i++) {
			sum=sum+Project1.manipulate(i, b);
		}
		System.out.println(sum);
		
	}
	
	public static long manipulate(int a,int b) {
	
		return 0;
	}
	public static long generator(int a) {
		
		int [] arr=new int[] {2,5};
		
		
		
		
		return 0;
	}
	
	
		
}


