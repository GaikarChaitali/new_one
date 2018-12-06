package com.chaitali.pojo;

public class User {
String userName,password,userType;

	

	public User(String userName, String password, String userType) {
		super();
		this.userName = userName;
		this.password = password;
		this.userType = userType;
	}



	public String getUserName() {
		return userName;
	}



	public void setUserName(String userName) {
		this.userName = userName;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public String getuserType() {
		return userType;
	}



	public void setuserType(String userType) {
		this.userType = userType;
	}



	@Override
	public String toString() {
		return "User [userName=" + userName + ", passowrd=" + password
				+ ", userType=" + userType + "]";
	}

	
}
