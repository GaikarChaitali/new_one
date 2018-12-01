package com.chaitali.assignment;

public class Employees {
	int empid;
	String ename;
	

	public Employees(int empid,String ename){
		this.empid=empid;
		this.ename=ename;
		/*this.salary=salary;*/
		
	
	}


	public int getEmpid() {
		return empid;
	}


	public void setEmpid(int empid) {
		this.empid = empid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	@Override
	public String toString() {
		return "Employees [empid=" + empid + ", ename=" + ename + "]";
	}

}
