package com.vamshi;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream1 {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Sunday","Monday","January","Wednesday","February","December","Saturday","Monday","Friday");
        String theory="i have a home in new dehli,and i am so facinated to go every time in a year ,have much more fun in home with my children";
		StringJoiner jner=new StringJoiner(",");
		  jner.add("vamshi");
		  jner.add("ram");
		  jner.add("anjaneyulu");
		  jner.add("srff");
		  jner.add("acsn");
		  System.out.println(jner);
		  
        /*
		 * names.stream().filter(name -> name.endsWith("day")) .sorted().map(name ->
		 * name .toUpperCase()) .forEach(name -> System.out.println(name));
		 */
		/*
		 * List<String> list=names.stream().filter(name->name.length()>=9)
		 * .collect(Collectors.toList()); List<String>
		 * list1=names.stream().filter(name->name.endsWith("day")).map(name->" Happy  "
		 * +name).collect(Collectors.toList());
		 */
	 
	  
	  
	//System.out.println(names.stream().anyMatch(name->name.length()>5));
	//names.stream().distinct().skip(5).forEach(System.out::println);
	 
		//System.out.println(names);
		//System.out.println(list);
		//System.out.println(list1);
		
		String[] limiter=theory.split(",");
		for(String s:limiter) {
			System.out.println(s);
		}
		
		

	}
}


