package com.hellojava.database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("DBManager")
public class DBManager implements IDBManager{
	@Autowired
	private DataSource dataSource;

	public ResultSet query(String sql,Object...obs)throws SQLException{
		PreparedStatement psment=this.dataSource.getConnection().prepareStatement(sql);
		if(obs!=null) {
			for (int i = 0; i < obs.length; i++) {
				psment.setObject(i+1, obs[i]);
			}
		}
		return psment.executeQuery();
	}
	
	public int update(String sql,Object...obs)throws SQLException{
		PreparedStatement psment=this.dataSource.getConnection().prepareStatement(sql);
		if(obs!=null) {
			for (int i = 0; i < obs.length; i++) {
				psment.setObject(i+1, obs[i]);
			}
			
		}
		return psment.executeUpdate();
	}
}
