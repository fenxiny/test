package com.hellojava.demo6;

import java.util.ArrayList;
import java.util.List;

public class ClassTable<Student> {
	private List<Student> students;
	
	public ClassTable(){
		students=new ArrayList<>();
	}
	//有两个线程同时访问addStudent() 
	public synchronized void addStudent(Student s){
		students.add(s);
	}
	
	/*
	 * 同步锁永远是当前对象 this(同步锁不能自定义 默认是this)
	 * public synchronized void addStudent(Student s){
		students.add(s);
	   }
	   
	   //指定同步锁
	   public void addStudent(Student s){
	   	synchronized(""){ 
			students.add(s);
		}
	   }
	 */
}
