package com.springMVC.Employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		EmployeeDAO dao = (com.springMVC.Employee.EmployeeDAO) context.getBean("edao");
		
		Employee e1=new Employee();
		e1.setId(1);
		e1.setName("abc");
		e1.setSalary(100);
		
		Employee e2=new Employee();
		e2.setId(2);
		e2.setName("abcd");
		e2.setSalary(10000);
		
	dao.saveEmployee(e2);
		dao.updateEmployee(e1);
		((AbstractApplicationContext) context).close();
		
    }
}
