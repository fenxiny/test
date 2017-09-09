package com.hellojava.dao;

import java.util.List;

import com.hellojava.mybatis.entity.Student;

public interface IStudentDao {
	public List<Student> loadAll();
	public int save(Student s);
	public int delete(int stuId);
	public int update(Student s);
}
