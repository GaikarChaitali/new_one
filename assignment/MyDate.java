package com.chaitali.assignment;

public class MyDate {
	int dd;
	int mm;
	int yyyy;
	
	
	public MyDate(int dd, int mm, int yyyy){
		this.dd=dd;
		this.mm=mm;
		this.yyyy=yyyy;
	}
	
	
	public int getDd() {
		return dd;
	}
	public int getMm() {
		return mm;
	}
	public int getYyyy() {
		return yyyy;
	}
	public void setDd(int dd) {
		this.dd = dd;
	}
	public void setMm(int mm) {
		this.mm = mm;
	}
	public void setYyyy(int yyyy) {
		this.yyyy = yyyy;
	}


	@Override
	public String toString() {
		return "MyDate [dd=" + dd + ", mm=" + mm + ", yyyy=" + yyyy + "]";
	}


	/*@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dd;
		result = prime * result + mm;
		result = prime * result + yyyy;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		MyDate obj=(MyDate) o;
		
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyDate other = (MyDate) obj;
		if (dd != other.dd)
			return false;
		if (mm != other.mm)
			return false;
		if (yyyy != other.yyyy)
			return false;
		return true;
	}*/
	


	
}
