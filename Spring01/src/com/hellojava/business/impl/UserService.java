package com.hellojava.business.impl;

import com.hellojava.business.IUserService;
import com.hellojava.dao.IUserDao;

public class UserService implements IUserService {
	private IUserDao userDao;
	public IUserDao getUserDao() {
		return userDao;
	}
	public void setUserDao(IUserDao userDao) {
		this.userDao = userDao;
	}
	@Override
	public boolean save() {
		userDao.save();
		return true;
	}

}
