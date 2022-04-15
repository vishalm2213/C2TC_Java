package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.User;

public interface IUserService {

	public User addUser(User user); //C
	public User updateUser(User user); //U
	public User deleteUser(User user); //D 
	public User searchUserById(int id); //R
	public boolean login(User user);
	public boolean logOut();
}
