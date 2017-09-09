package com.hellojava.business.impl;

import com.hellojava.business.IUserService;
import com.hellojava.dao.IUserDao;

public class UserService implements IUserService{
	private IUserDao userDao;
	
	public UserService(IUserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public boolean save() {
		System.out.println("UserService save");
		userDao.save();
		return true;
	}

}
