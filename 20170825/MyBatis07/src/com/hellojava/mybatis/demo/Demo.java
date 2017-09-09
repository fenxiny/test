package com.hellojava.mybatis.demo;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.dao.IUserDao;
import com.hellojava.mybatis.entity.User;

public class Demo {
	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.openSqlSession(true);
		IUserDao userDao=session.getMapper(IUserDao.class);
//		List<User> users=new ArrayList<>();
//		for (int i = 0; i < 3; i++) {
//			User user=new User();
//			user.setUserName("hello"+(i+1));
//			user.setUserPwd("a111");
//			
//			users.add(user);
//		}
//		userDao.save(users);
		
		User user=new User();
		//user.setUserId(1);
		user.setUserName("hello1");
		//user.setUserPwd("a111");
		
		//userDao.update(user);
		
		System.out.println(userDao.loadUser(user));
	}
}
