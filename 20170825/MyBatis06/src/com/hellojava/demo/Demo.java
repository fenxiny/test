package com.hellojava.demo;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.mybatis.config.MyBatisUtils;
import com.hellojava.mybatis.dao.IClassDao;
import com.hellojava.mybatis.dao.IStudentDao;
import com.hellojava.mybatis.entity.ClassTable;
import com.hellojava.mybatis.entity.Student;

public class Demo {
	public static void main(String[] args) {
		
		//һ��һ  Person   Card(������)
		//������ Person ������Card   Cardû�й���Person
		
		//һ�Զ� Student  --  һ�� Class
		// Class  -- ���Student
		
		SqlSession session=MyBatisUtils.openSqlSession(true);
//		IClassDao classDao=session.getMapper(IClassDao.class);
//		ClassTable ct=new ClassTable();
//		ct.setClassName("100001");
//		classDao.save(ct);
		
//		IStudentDao studentDao=session.getMapper(IStudentDao.class);
//		Student s=new Student();
//		s.setStuName("������");
//		s.setStuSex("��");
//		s.setStuAge(22);
//		ClassTable ct=new ClassTable();
//		ct.setClassId(1);
//		ct.setClassName("100001");
//		s.setClassTable(ct);
//		studentDao.save(s);
		
//		IStudentDao studentDao=session.getMapper(IStudentDao.class);
		//studentDao.loadAll().forEach(System.out::println);
//		System.out.println(studentDao.loadById(2));
		
		
		IClassDao classDao=session.getMapper(IClassDao.class);
		List<ClassTable> classTables=classDao.loadAll();
		classTables.forEach(System.out::println);
		
		
		
		
		
		
		
		
	}
}
