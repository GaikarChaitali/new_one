package com.chaitali.assignment;

public class TestClass {
	public static void main(String[] args) {


		Account acc1=new Account("ram");
		Account acc2=new Account("Chaitali");
		Account acc3=new Account("swati");

		Employees emp1=new Employees(134,"ram");
		Employees emp2=new Employees(154,"karan");
		Employees emp3=new Employees(176,"shyam");

		MyList<Account> mylist1=new MyList<>();
		mylist1.add(acc1);
		mylist1.add(acc2);
		mylist1.add(acc3);
		
		
		System.out.println(mylist1.get());
		//mylist1.add(emp1);


		/*for(Account a1:mylist1){  
			System.out.println(a1.accHolderName); 
		} */


		MyList<Employees> mylist2=new MyList<>();
		mylist2.add(emp1);
		mylist2.add(emp2);
		mylist2.add(emp3);
		
		System.out.println(mylist2.get());
		//mylist2.remove(emp1);

		/*for(Employees e1:mylist2){  
			System.out.println(e1.empid); 
		}*/
	}
}
