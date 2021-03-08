package com.vamshi;

import java.util.Calendar;

/*
 * public class Test {
 * //it is success full
 * public static void main(String[] args) {
 * Nav.Direction d=Nav.Direction.EAST;
 * System.out.println(d);
 * }
 * }
 * class Nav{
 * public enum Direction{
 * NORTH,SOUTH,EAST,WEST;
 * }
 * 
 * }
 */
/*
 * public class Test{
 * args successfull
 * public static void main(String[] args) {
 * 
 * m1(1,"vamshi","vamshi","vamshi");
 * }
 * 
 * public static void m1( int j,String... args){
 * 
 * System.out.println(args[2]);
 * }
 * 
 * }
 */

public class Test{
	public static void main(String[] args) {
		
    
	  Runnable r=()->{
		  for(int i=0;i<100;i++) {
		    	System.out.println("child"+i);
		    }
		 
	  };
	  Thread t=new Thread(r);
	  t.start();
	  for(int i=0;i<100;i++) {
	    	System.out.println("main"+i);
	    }
	
	}	
	
}

