package com.hellojava.mybatis.dao;

import java.util.List;
import java.util.Map;

import com.hellojava.mybatis.entity.Student;

public interface IStudentDao {
	public List<Student> loadAll();
	public List<Student> loadPage(Map<String, Object> maps);
}
