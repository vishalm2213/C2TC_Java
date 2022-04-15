package com.cg.placementmanagement.service;

import com.cg.placementmanagement.entity.User;
import com.cg.placementmanagement.repository.IUserRepository;
import com.cg.placementmanagement.repository.IUserRepositoryImpl;

public class IUserServiceImpl implements IUserService {

	IUserRepository dao;

	public IUserServiceImpl() {
		dao = new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User deleteUser(User user) {
		dao.beginTransaction();
		dao.deleteUser(user);
		dao.commitTransaction();
		return null;
	}

	@Override
	public User searchUserById(int id) {
		User user = dao.searchUserById(id);
		return user;
	}

	@Override
	public boolean login(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean logOut() {
		// TODO Auto-generated method stub
		return false;
	}


	

	
	
}
