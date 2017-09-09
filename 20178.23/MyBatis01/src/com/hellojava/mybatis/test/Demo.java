package com.hellojava.mybatis.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hellojava.dao.StudentDao;
import com.hellojava.mybatis.entity.Student;

public class Demo {
	public static void main(String[] args) throws IOException {
		StudentDao studentDao=new StudentDao();
		//studentDao.loadAll().forEach(System.out::println);
		Student s=new Student();
		s.setStuId(50);
		s.setStuName("уенч╪и");
		s.setStuSex("е╝");
		s.setStuAge(22);
		
		
		//studentDao.delete(52);
		
		studentDao.update(s);
	}
}
