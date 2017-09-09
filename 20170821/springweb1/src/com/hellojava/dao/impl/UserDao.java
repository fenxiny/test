package com.hellojava.dao.impl;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.hellojava.dao.IUserDao;
import com.hellojava.entity.User;

public class UserDao extends JdbcDaoSupport implements IUserDao{

	@Override
	public User loadByName(User user) {
		final User u=new User();
		String sql="select * from users where userName=? and userPwd=?";
		this.getJdbcTemplate().query(new PreparedStatementCreator() {
			@Override
			public PreparedStatement createPreparedStatement(Connection conn) throws SQLException {
				PreparedStatement psment= conn.prepareStatement(sql);
				psment.setString(1, user.getUserName());
				psment.setString(2, user.getUserPwd());
				return psment;
			}
		}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				u.setUserId(rs.getInt("userId"));
				u.setUserName(rs.getString("userName"));
				u.setUserPwd(rs.getString("userPwd"));
			}
		});
		return u;
	}
	
}
