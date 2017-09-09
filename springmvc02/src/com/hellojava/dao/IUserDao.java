package com.hellojava.dao;

import com.hellojava.entity.User;

public interface IUserDao {
	public User loadByName(User user);
}
