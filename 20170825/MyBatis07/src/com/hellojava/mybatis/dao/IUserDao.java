package com.hellojava.mybatis.dao;

import java.util.List;

import com.hellojava.mybatis.entity.User;

public interface IUserDao {
	public int save(List<User> users);
	public int update(User u);
	public User loadUser(User u);
}
