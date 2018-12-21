package com.springMVC.Employee;

public interface EmployeeDAO {
	public int saveEmployee(Employee e);
	public int updateEmployee(Employee e);
	public int deleteEmployee(Employee e) ;
}
