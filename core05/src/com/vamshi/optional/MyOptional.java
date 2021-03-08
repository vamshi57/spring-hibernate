package com.vamshi.optional;

import java.util.Optional;





public class MyOptional {
	public static void main(String[] args) {
		
		Integer[] array=new Integer[5];
		//array[3]=12;
		Optional<Integer> op=Optional.of(array[3]);
		if(op.isPresent()) {
			System.out.println("element present");
		}
		else {
			System.out.println("element not present");
		}
		
		
	 
		
	 
	}

}
