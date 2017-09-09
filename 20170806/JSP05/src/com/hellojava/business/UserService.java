package com.hellojava.business;

import org.apache.log4j.Logger;

import com.gellojava.web.entity.User;
import com.hellojava.database.dao.UserDao;

public class UserService {
	private Logger log=Logger.getLogger(UserService.class);
	private UserDao userDao=new UserDao();
	public boolean checkUser(User u) {
		boolean bool=false;
		try {
			//查询user是否存在
			User user=userDao.loadUserByName(u);
			if(user!=null) {
				bool=true;
			}
		} catch (Exception e) {
			log.debug(e.getMessage());
		}
		return bool;
	}
}
