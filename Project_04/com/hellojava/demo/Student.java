package com.hellojava.demo;
import java.io.Serializable;

//Comparable 排序接口
//TreeSet 要求需要对进来的元素都要进行自然排序(Student 对象)

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