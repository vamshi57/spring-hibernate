package com.vamshi.patterns;


import java.util.Comparator;
import java.util.TreeSet;

import com.vamshi.entity.MyExample;
  class MyCollections {
	public static void main(String[] args) {
		/*TreeSet<String> ts=new TreeSet<String>();
		ts.add("a");
		ts.add("z");
		ts.add("m");
		System.out.println(ts);*/
		TreeSet<MyExample> ts=new TreeSet<MyExample>(( o1,o2)->o1.getI()-o2.getI());
		ts.add(new MyExample(3,5));
		ts.add(new MyExample(5,6));
		ts.add(new MyExample(2,7));
		
		System.out.println(ts);
		
	}

	

}
