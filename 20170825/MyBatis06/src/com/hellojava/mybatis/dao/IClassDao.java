package com.hellojava.mybatis.dao;

import java.util.List;

import com.hellojava.mybatis.entity.ClassTable;

public interface IClassDao {
	public int save(ClassTable ct);
	public List<ClassTable> loadAll();
}
