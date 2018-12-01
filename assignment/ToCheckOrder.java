package com.chaitali.assignment;

import java.util.*;

public class ToCheckOrder {


	static void hashSetDemo(){
		HashSet<String> hashset=new HashSet<>();
		hashset.add("E");
		hashset.add("Z");
		hashset.add("D");
		hashset.add("C");
		System.out.println("insersion order is A,Z,10,G");
		System.out.println(hashset);
		System.out.println("not preserved in hashset");
		System.out.println("****************");
	}

	static void linkedHashSetDemo(){
		LinkedHashSet<String> linkedhashset=new LinkedHashSet<>();
		linkedhashset.add("E");
		linkedhashset.add("B");
		linkedhashset.add("C");
		linkedhashset.add("D");
		System.out.println("insersion order is A,Z,10,G");
		System.out.println(linkedhashset);
		System.out.println("preserved in linkedhashset");
		System.out.println("****************");
	}

	public static void main(String[] args) {
		hashSetDemo();
		linkedHashSetDemo();
	}
}
