package com.hellojava.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.hellojava.mybatis.entity.Student;

public interface IStudentDao {
	@Select("select * from student")
	public List<Student> loadAll();
	@Insert("insert into student values(default,#{stuName},#{stuSex},#{stuAge})")
	public int save(Student s);
	@Delete("delete from student where stuId=#{stuId}")
	public int delete(int stuId);
	@Update("update student set stuName=#{stuName},stuSex=#{stuSex},stuAge=#{stuAge} where stuId=#{stuId}")
	public int update(Student s);
	@Select("select * from student limit #{0},#{1}")
	public List<Student> loadPage(int startIndex,int endIndex);
	@Select("select stuName from student where stuId=#{stuId}")
	public Student loadById(int stuId);
	@Select("select count(stuId) from student")
	public int getTotalCount();
	
	//XML配置 参数和返回值
	//一对一 一对多  多对多(MyBatis 不存在)
	
	//mybatis 缓存
	//Spring SpringMvc MyBatis 集成
}
