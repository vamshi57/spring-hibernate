package com.vamshi.patterns;

public class PatternOne {
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			for(int j=10;j>0;j--) {
				if(2*i>j+i) {
					System.out.print("*");
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
