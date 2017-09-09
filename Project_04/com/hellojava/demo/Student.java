package com.hellojava.demo;
import java.io.Serializable;

//Comparable ����ӿ�
//TreeSet Ҫ����Ҫ�Խ�����Ԫ�ض�Ҫ������Ȼ����(Student ����)

public class Student implements Serializable,Comparable<Student>{
	private int stuId;
	private String stuName;
	
	public void setStuId(int stuId){
		this.stuId=stuId;
	}
	
	public int getStuId(){
		return this.stuId;
	}
	
	public void setStuName(String stuName){
		this.stuName=stuName;
	}
	
	public String getStuName(){
		return this.stuName;
	}
	
	public boolean equals(Object obj){
		boolean bool=false;
		if(obj instanceof Student){
			Student s=(Student)obj;
			bool=this.stuId==s.getStuId();
		}
		return bool;
	}
	
	public int compareTo(Student stu){
		return new Integer(this.stuId).compareTo(stu.getStuId());
	}
}