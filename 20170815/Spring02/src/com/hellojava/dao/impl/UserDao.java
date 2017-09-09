package com.hellojava.dao.impl;

import com.hellojava.dao.IUserDao;

public class UserDao implements IUserDao {

	@Override
	public int save() {
		System.out.println("userDao save");
		return 0;
	}

	@Override
	public void destroy() {
		System.out.println("destroy");
	}

	@Override
	public void init() {
		System.out.println("init");
	}


}
