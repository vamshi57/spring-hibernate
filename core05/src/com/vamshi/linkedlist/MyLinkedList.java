package com.vamshi.linkedlist;



import java.util.LinkedList;

public class MyLinkedList {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<>();
		ll.add("vamshi");ll.add("ram");ll.add("shiva");ll.add("shbjsa");
		System.out.println(ll);
		ll.add(1, "vamshi");
		System.out.println(ll);
		ll.add(1, "vamshi");
		System.out.println(ll);
		ll.offerLast("vamshilast");
		ll.offer("bhjsc");
		ll.offerFirst("first");
		System.out.println(ll);
		ll.add(null);ll.add(null);ll.add(null);
		System.out.println(ll);
		
			
		
		
		
	}

}
