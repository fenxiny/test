package com.hellojava.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.hellojava.mybatis.MyBatisUtils;
import com.hellojava.mybatis.entity.Student;

public class StudentDao {
	public List<Student> loadAll(){
		SqlSession session=MyBatisUtils.openSqlSession();
		return session.selectList("com.hellojava.studentmapper.loadAll");
	}
	
	public int save(Student s){
		SqlSession session=MyBatisUtils.openSqlSession();
		int count=0;
		try{
			count=session.insert("com.hellojava.studentmapper.save",s);
			session.commit();
		}catch(Exception e){
			session.rollback();
		}
		return count;
	}
	
	public int delete(int stuId){
		SqlSession session=MyBatisUtils.openSqlSession();
		int count=0;
		try{
			count=session.delete("com.hellojava.studentmapper.delete",stuId);
			session.commit();
		}catch(Exception e){
			session.rollback();
		}
		return count;
	}
	
	public int update(Student s){
		SqlSession session=MyBatisUtils.openSqlSession();
		int count=0;
		try{
			count=session.update("com.hellojava.studentmapper.update",s);
			session.commit();
		}catch(Exception e){
			session.rollback();
		}
		return count;
	}
}
