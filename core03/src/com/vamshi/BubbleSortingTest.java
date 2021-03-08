package com.vamshi;

public class BubbleSortingTest {
	
	public static void main(String[] args) {
		int[] ar= {15,12,13,15,20,10} ;
           	
		
		    int temp=0;
		    for(int j=1;j<=ar.length-1;j++) {
			for(int i=1;i<=ar.length-j;i++) {
				if(ar[i-1]>ar[i])
				{
					temp=ar[i-1];
					ar[i-1]=ar[i];
					ar[i]=temp;
				}
			}
		   }
		for (int i : ar) {
			System.out.print(i+" ");	
		}
		
	 
	}
}

