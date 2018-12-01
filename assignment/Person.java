package com.chaitali.assignment;

public class Person implements Comparable<Person>{

	 double weight,height;
	 String name;

	public Person(double weight, String name, double height) {  
		this.weight = weight;  
		this.name = name;  
		this.height = height;    
	}

	public int compareTo(Person p1) {  
		if(weight>p1.weight){  
			return 1;  
		}else 
		if(weight<p1.weight){  
			return -1;  
		}
		else 
		
		if(height>p1.height){
			return 1;
		}else{
		return 0;
		}  
	}  

}

