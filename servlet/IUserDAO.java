package com.chaitali.pojo;

public interface IUserDAO {
public String getUserType(String userName, String password) ;
public void addUser();
public void changePassword(String UserName,String oldPassword,String newPassword);
public void removeUser();

}
