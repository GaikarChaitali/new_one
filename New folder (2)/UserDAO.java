package com.chaitali.servlet;

import java.util.ArrayList;

import com.chaitali.pojo.User;

public class UserDAO {

	ArrayList<User> userList;
	public UserDAO() {
		userList= new ArrayList<User>();
		userList.add(new User("chaitali","jaguar","Admin"));
		userList.add(new User("swati","java","User"));
		userList.add(new User("karan","car","Admin"));
	}
	public String getUserType(String userName,String password){

		for(User user:userList){
			if(user.getUserName().equals(userName)&&user.getPassowrd().equals(password)){
				return user.getuserType();
			}
		}
throw new InvalidUserException(" user doesn't exist");
	}


}
