package com.hellojava.dao.impl;

import com.hellojava.dao.IUserDao;

public class UserDao implements IUserDao{

	@Override
	public int save() {
		System.out.println("UserDao Save()");
		return 0;
	}
		
}
