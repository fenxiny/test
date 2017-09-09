package com.hellojava.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.dao.IStudentDao;

public class Demo {
	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.openSqlSession();
		IStudentDao studentDao=session.getMapper(IStudentDao.class);
		Map<String,Object> list=new HashMap<String,Object>();
		list.put("startIndex",0);
		list.put("endIndex",10);
		studentDao.loadPage(list).forEach(System.out::println);
	}
}
