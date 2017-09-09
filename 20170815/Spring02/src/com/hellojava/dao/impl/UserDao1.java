package com.hellojava.dao.impl;

import com.hellojava.dao.IUserDao;

public class UserDao1 implements IUserDao{

	@Override
	public int save() {
		System.out.println("UserDao1 save");
		return 0;
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init() {
		
	}
	
}
