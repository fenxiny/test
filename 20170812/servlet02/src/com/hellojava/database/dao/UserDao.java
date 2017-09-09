package com.hellojava.database.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.hellojava.database.DBManager;
import com.hellojava.entity.User;

public class UserDao extends DBManager{
	public User loadUser(User u)throws SQLException{
		User user=null;
		Connection conn=this.openConnection();
		String sql="select * from users where userName=? and userPwd=md5(?)";
		Object[] obs= {u.getUserName(),u.getUserPwd()};
		ResultSet rs=this.query(conn, sql, obs);
		if(rs.next()) {
			user=new User();
			user.setUserId(rs.getInt("userId"));
			user.setUserName(rs.getString("userName"));
			user.setUserPwd(rs.getString("userPwd"));
		}
		return user;
	}
}
