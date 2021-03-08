package com.vamshi.bufferedreader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MyBufferedReader {
	
	
	public static void main(String[] args)throws Exception {
		
	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	String a=br.readLine();
	System.out.println(a);
	
	}

}
