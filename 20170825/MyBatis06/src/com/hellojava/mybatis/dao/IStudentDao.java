package com.hellojava.mybatis.dao;

import java.util.List;

import com.hellojava.mybatis.entity.Student;

public interface IStudentDao {
	public int save(Student s);
	public List<Student> loadAll();
	public Student loadById(int stuId);
}
