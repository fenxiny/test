package com.hellojava.business;

import org.apache.log4j.Logger;

import com.hellojava.database.dao.UserDao;
import com.hellojava.entity.User;

public class UserService {
	private UserDao userDao=new UserDao();
	private Logger logger=Logger.getLogger(UserService.class);
	public boolean checkUser(User u) {
		boolean bool=false;
		try {
			User user=userDao.loadUser(u);
			if(user!=null) {
				bool=true;
			}
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return bool;
	}
}
