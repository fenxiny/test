package com.hellojava.mybatis.dao;

import java.util.List;

import com.hellojava.mybatis.entity.Person;

public interface IPersonDao {
	public List<Person> loadAll();
	public Person loadById(int personId);
}
