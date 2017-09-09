package com.hellojava.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hellojava.web.tools.Configuration;

/**
 * 
 * @author Administrator
 *
 */
public abstract class DBManager {
	//�߳̿ռ�(���� �߳̿ռ� Thread )
	private ThreadLocal<Connection> threadLocal=new ThreadLocal<>();
	//��������
	static{
		String driver=Configuration.getProperty("connection.driverClass");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 
	 * @return
	 * @throws SQLException
	 */
	public Connection openConnection()throws SQLException{
		Connection conn=threadLocal.get();
		if(conn==null){
			String url=Configuration.getProperty("connection.url");
			String user=Configuration.getProperty("connection.username");
			String password=Configuration.getProperty("connection.password");
			conn=DriverManager.getConnection(url, user, password);
			threadLocal.set(conn);
		}
		return conn;
	}
	
	/**
	 * 
	 * @throws SQLException
	 */
	public void closeConnection()throws SQLException{
		Connection conn=threadLocal.get();
		if(conn!=null){
			conn.close();
			threadLocal.set(null);
		}
	}
	
	/**
	 * 
	 * @param conn
	 * @param sql
	 * @param obs
	 * @return
	 * @throws SQLException
	 */
	public ResultSet query(Connection conn,String sql,Object...obs)throws SQLException{
		ResultSet rs=null;
		if(conn!=null && !conn.isClosed()){
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null){
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			rs=psment.executeQuery();
		}
		return rs;
	} 
	
	/**
	 * 
	 * @param conn
	 * @param sql
	 * @param obs
	 * @return
	 * @throws SQLException
	 */
	public int update(Connection conn,String sql,Object...obs)throws SQLException{
		int count=0;
		if(conn!=null && !conn.isClosed()){
			PreparedStatement psment=conn.prepareStatement(sql);
			if(obs!=null){
				for (int i = 0; i < obs.length; i++) {
					psment.setObject(i+1, obs[i]);
				}
			}
			count=psment.executeUpdate();
		}
		return count;
	} 
}
