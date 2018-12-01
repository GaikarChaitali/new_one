package com.chaitali.assignment;

import java.util.*;

public class TestPersonClass {
	public static void main(String[] args) {

		TreeSet<Person> p=new TreeSet<Person>();

		Person person1= new Person(45,"priti",5.4);
		Person person2= new Person(35.2,"urvi",4);
		Person person3= new Person(41,"poojitha",4.8);
		Person person4= new Person(45,"swati",3.8);
		Person person5= new Person(52,"chaitali",5.2);

		p.add(person1);
		p.add(person2);
		p.add(person3);
		p.add(person4);
		p.add(person5);

		for(Person p1:p){  
			System.out.println(p1.weight+" "+p1.name+" "+p1.height); 
		} 

	}
}
