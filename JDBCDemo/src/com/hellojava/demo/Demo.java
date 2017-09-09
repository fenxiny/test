package com.hellojava.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test?useSSL=true";
		Connection conn=DriverManager.getConnection(url, "root", "f199628");
		Statement stm=conn.createStatement();
		
		String sql="select * from stu";
		
		ResultSet rs=stm.executeQuery(sql);
		while(rs.next()){
			System.out.println(rs.getInt("ID")+"--"+rs.getString("Name")+"--"+rs.getInt("AGE")+"--"+rs.getString("SEX"));
		}
		conn.close();
	}
}










