package com.chaitali.pojo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAOV2 implements IUserDAO {

	@Override
	public String getUserType(String userName, String password) {
		// TODO Auto-generated method stub
		Connection connection=ConnectionFactory.getConnection();
		try{
		PreparedStatement statement= connection.prepareStatement("select * from userTable where userName=? and password=?");
		statement.setString(1, userName);
		statement.setString(2, password);
		ResultSet set=statement.executeQuery();
		while(set.next()){
			if(set.getString("userName").equals(userName)&&set.getString("password").equals(password))
				return set.getString("userType");
			}
		
	}catch(SQLException e){
		e.printStackTrace();
	}
		return null;
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
public static void main(String[] args) {
	System.out.println(new UserDAOV2().getUserType("chaitali", "jaguar"));
}
}
