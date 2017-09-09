package com.hellojava.mybatis.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ClassTable implements Serializable{
	private int classId;
	private String className;
	private List<Student> stuList=new ArrayList<>();
	
	public List<Student> getStuList() {
		return stuList;
	}
	public void setStuList(List<Student> stuList) {
		this.stuList = stuList;
	}
	public int getClassId() {
		return classId;
	}
	public void setClassId(int classId) {
		this.classId = classId;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	@Override
	public String toString() {
		return "ClassTable [classId=" + classId + ", className=" + className + ", stuList=" + stuList
				+ ", getStuList()=" + getStuList() + ", getClassId()=" + getClassId() + ", getClassName()="
				+ getClassName() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
