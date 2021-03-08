package core01;

import java.util.ArrayList;
import java.util.List;

public class A {
	
	int[] a=new int[4];
	
	List al=new ArrayList();
	int i=10;
	
	
	
	A(){
	System.out.println("runtime exception");

	}
	A(int i,int j){
		System.out.println("system");
		System.out.println(a.length);
		System.out.println(al.size());
		System.out.println(i);
	}
}
