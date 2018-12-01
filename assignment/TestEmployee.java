package com.chaitali.assignment;

import java.util.HashMap;

public class TestEmployee {
	public static void main(String[] args) {

		HashMap<Employee,Integer> hashmap=new HashMap<>();

		Employee employee1=new Employee("rina",24);
		Employee employee2=new Employee("rina",21);
		Employee employee3=new Employee("rina",24);


		hashmap.put(employee1,1);
		hashmap.put(employee2,2);
		hashmap.put(employee3,3);

		System.out.println(employee1.equals(employee2));


		System.out.println(employee1.hashCode());
		System.out.println(employee3.hashCode());

	}
}
