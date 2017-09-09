package com.hellojava.mybatis.demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.dao.ICardDao;
import com.hellojava.mybatis.dao.IPersonDao;
import com.hellojava.mybatis.entity.Person;

public class Demo {
	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.openSqlSession();
		//ICardDao cardDao=session.getMapper(ICardDao.class);
		//cardDao.loadAll().forEach(System.out::println);
//		System.out.println(cardDao.loadById(1));
		
		IPersonDao personDao=session.getMapper(IPersonDao.class);
//		List<Person> list=personDao.loadAll();
//		list.forEach(System.out::println);
		
		System.out.println(personDao.loadById(2));
	}
}
