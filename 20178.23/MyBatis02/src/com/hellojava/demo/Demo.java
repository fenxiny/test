package com.hellojava.demo;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.dao.IStudentDao;
import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.entity.Student;

public class Demo {
	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.openSqlSession(true);
		//根据Dao接口自动生成Dao的实现类
		IStudentDao studentDao=session.getMapper(IStudentDao.class);
		//studentDao.loadAll().forEach(System.out::println);
		
//		Student s=new Student();
//		s.setStuName("张三丰");
//		s.setStuSex("男");
//		s.setStuAge(22);
//		
//		studentDao.save(s);
		
		studentDao.delete(54);
	}
}
