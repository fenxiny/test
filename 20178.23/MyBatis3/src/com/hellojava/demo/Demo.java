package com.hellojava.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.dao.IStudentDao;
import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.entity.Student;

public class Demo {
	public static void main(String[] args) {
		SqlSession session=MyBatisUtils.openSqlSession(true);
		//����Dao�ӿ��Զ�����Dao��ʵ����
		IStudentDao studentDao=session.getMapper(IStudentDao.class);
		//studentDao.loadAll().forEach(System.out::println);
		
//		Student s=new Student();
//		s.setStuName("������");
//		s.setStuSex("��");
//		s.setStuAge(22);
//		
//		studentDao.save(s);
		
		//studentDao.delete(54);
		
		//studentDao.loadPage(0, 10).forEach(System.out::println);
		
//		Map<String, Object> maps=new HashMap<>();
//		maps.put("startIndex", 0);
//		maps.put("endIndex", 10);
		
		//studentDao.loadPage(0,10).forEach(System.out::println);
		
		//System.out.println(studentDao.loadById(10));
		
		System.out.println(studentDao.getTotalCount());
	}
}