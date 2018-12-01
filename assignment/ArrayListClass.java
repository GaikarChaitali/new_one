package com.chaitali.assignment;

import java.util.*;

public class ArrayListClass {
	public static void main(String[] args) {
		List arraylist=new ArrayList<>();
		arraylist.add(10);
		arraylist.add(7);
		arraylist.add(3);
		arraylist.add(12);
		arraylist.add(17);
		
		//System.out.println(arraylist);
		
		/*Collections.reverse(arraylist);
		System.out.println(arraylist);*/
		
		
		System.out.println("Original");
		ListIterator iterator=arraylist.listIterator(arraylist.size());

		while(iterator.hasPrevious()){
			System.out.println(iterator.previous());
		}
		
		System.out.println("**************************");
		System.out.println("After reversing");
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}

	}
}
