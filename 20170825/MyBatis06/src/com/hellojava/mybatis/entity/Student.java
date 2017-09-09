package com.hellojava.mybatis.entity;

import java.io.Serializable;

public class Student implements Serializable{
	private int stuId;
	private String stuName;
	private String stuSex;
	private int stuAge;
	private ClassTable classTable=new ClassTable();
	
	public int getStuId() {
		return stuId;
	}
	public void setStuId(int stuId) {
		this.stuId = stuId;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuSex() {
		return stuSex;
	}
	public void setStuSex(String stuSex) {
		this.stuSex = stuSex;
	}
	public int getStuAge() {
		return stuAge;
	}
	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}
	public ClassTable getClassTable() {
		return classTable;
	}
	public void setClassTable(ClassTable classTable) {
		this.classTable = classTable;
	}
	@Override
	public String toString() {
		return "Student [stuId=" + stuId + ", stuName=" + stuName + ", stuSex=" + stuSex + ", stuAge=" + stuAge
				+ ", classTable=" + classTable + "]";
	}
}
