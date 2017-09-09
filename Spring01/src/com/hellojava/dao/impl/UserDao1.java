package com.hellojava.dao.impl;

import com.hellojava.dao.IUserDao;

public class UserDao1 implements IUserDao{

	@Override
	public int save() {
		System.out.println("userDao1 save()");
		return 0;
	}

}
