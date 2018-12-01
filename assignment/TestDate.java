package com.chaitali.assignment;

import java.util.*;

public class TestDate {
	public static void main(String[] args) {

		MyDate emp1=new MyDate(25,10,1996);
		MyDate emp2=new MyDate(26,11,1998);
		MyDate emp3=new MyDate(30,12,2000);
		MyDate emp4=new MyDate(30,12,2010);

		Date name1=new Date("Chaitali");
		Date name2=new Date("Priti");
		Date name3=new Date("Swati");
		Date name4=new Date("urvi");

		HashMap<MyDate,Date> hashmap=new HashMap<>();
		hashmap.put(emp1, name1);
		hashmap.put(emp2, name2);
		hashmap.put(emp3, name3);
		hashmap.put(emp4, name4);

		System.out.println(hashmap);
		
	

	}
}
