package com.hellojava.database;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.hellojava.tools.Configuration;
/**
 * 数据库进行连接并执行命令
 * @author Administrator
 * 这个类对应整个数据库(test)
 */
public class DBManager {
	//加载驱动
	//匿名静态块(静态块类加载的时候 匿名)
	static{
		try {
			String driverClass=Configuration.getPropertiesValue("driver_class");
			Class.forName(driverClass);
		} catch (ClassNotFoundException|FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	/**
	 * 获得数据库连接对象
	 * @return 数据库连接对象
	 * @throws SQLException
	 */
	public static Connection openConnection()throws SQLException,FileNotFoundException{
		String url=Configuration.getPropertiesValue("url");
		String userName=Configuration.getPropertiesValue("username");
		String password=Configuration.getPropertiesValue("password");
		return DriverManager.getConnection(url, userName, password);
	}
	
	/**
	 * 关闭数据库连接对象
	 * @param conn 数据库连接对象
	 * @throws SQLException
	 */
	public static void closeConnection(Connection conn)throws SQLException{
		if(conn!=null && !conn.isClosed()){
			conn.close();
			conn=null;
		}
	}
	
	/**
	 * 执行增删改等没有结果集的SQL命令
	 * @param conn 数据库的链接对象
	 * @param sql 需要执行的SQL语句
	 * @param obs sql命令中的?参数 
	 * @return 受影响的行数
	 * @throws SQLException
	 */
	public static int update(Connection conn,String sql,Object...obs)throws SQLException{
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
	
	/**
	 * 执行查询的SQL命令
	 * @param conn 数据库连接对象
	 * @param sql SQL查询命令
	 * @param obs SQL命令中的?参数
	 * @return 结果集
	 * @throws SQLException
	 */
	public static ResultSet query(Connection conn,String sql,Object...obs)throws SQLException{
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
}















