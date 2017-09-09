package com.hellojava.database;

import java.sql.ResultSet;
import java.sql.SQLException;

public interface IDBManager {
	public ResultSet query(String sql,Object...obs)throws SQLException;
	public int update(String sql,Object...obs)throws SQLException;
}
