package com.hellojava.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	private static String configFilePath="com/hellojava/mybatis/config/mybatis-config.xml";
	public static void setConfigFilePath(String configFilePath) {
		MyBatisUtils.configFilePath = configFilePath;
	}

	private static SqlSessionFactory sessionFactory;
	
	static{
		InputStream inStream=null;
		try {
			inStream = Resources.getResourceAsStream(configFilePath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(inStream!=null){
			SqlSessionFactoryBuilder builder=new SqlSessionFactoryBuilder();
			sessionFactory=builder.build(inStream);
		}
	}
	
	private static void rebuilderSqlSessionFactory() throws Exception {
		InputStream inStream = Resources.getResourceAsStream(configFilePath);
		if (inStream != null) {
			SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
			sessionFactory = builder.build(inStream);
		}
	}
	
	public static SqlSession openSqlSession(){
		if(sessionFactory==null){
			try {
				rebuilderSqlSessionFactory();
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		return sessionFactory.openSession();
	}
	
	public static void closeSqlSession(SqlSession session){
		if(session!=null){
			session.close();
		}
	}
}
