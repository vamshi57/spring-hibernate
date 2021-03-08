package com.vamshi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.vamshi.MyMap.MyEntry;

public class ImmutableClass {
	MyMap.MyEntry<String,Integer> entry;
	
 
	
	
	public static void main(String[] args) {
		HashMap<String , String> map=new HashMap();
		map.hashCode();
		
		
	
	}
}
/*
 * final class MyString{
 * private char[] ch;
 * private String a;
 * public MyString() {
 * 
 * }
 * public MyString(char[] ch) {
 * this.ch=ch;
 * }
 * public String toString() {
 * 
 * for(char c:ch) {
 * a=a+c;
 * }
 * return a;
 * }
 * }
 */


class A<T>{
	private T t;
	public A() {
		
	}
    A(T t){
    	this.t=t;
    }
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
    

}
interface MyMap<K,V>{
     interface MyEntry<K,V>{
	   default void myEntry(K key,V value) {
			System.out.println(key+" "+value);
		}
	}
}












