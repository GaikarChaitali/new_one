package com.chaitali.pojo;

import java.util.ArrayList;

import com.chaitali.servlet.InvalidUserException;


public class UserDAO implements IUserDAO{
	
	ArrayList<User> userList;
	
	public UserDAO() {
		userList = new ArrayList<>();
		userList.add(new User("chaitali", "jaguar", "Admin"));
		userList.add(new User("swati", "bmw", "User"));
		userList.add(new User("priti", "audi", "Admin"));
	}
	
	public String getUserType(String userName, String password) {
		for(User user:userList) {
			if(user.getUserName().equals(userName) && user.getPassword().equals(password))
			{
				return user.getuserType();
			}
		}
		throw new InvalidUserException("User Name and Password doesnt exists...");
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void changePassword(String UserName, String oldPassword,
			String newPassword) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser() {
		// TODO Auto-generated method stub
		
	}

	

}
