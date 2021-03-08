package com.vamshi.proxy;

public class Client {
	 public static void main(String [] args) {
	        Internate internate = new ProxyInternate();

	        try {
	            internate.connectTo("jasonfedin.org");
	            internate.connectTo("WHATEVER.com");
	        }
	        catch (Exception e)
	        {
	            System.out.println(e.getMessage());
	        }
	    }
}
