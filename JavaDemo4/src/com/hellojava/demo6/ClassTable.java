package com.hellojava.demo6;

import java.util.ArrayList;
import java.util.List;

public class ClassTable<Student> {
	private List<Student> students;
	
	public ClassTable(){
		students=new ArrayList<>();
	}
	//�������߳�ͬʱ����addStudent() 
	public synchronized void addStudent(Student s){
		students.add(s);
	}
	
	/*
	 * ͬ������Զ�ǵ�ǰ���� this(ͬ���������Զ��� Ĭ����this)
	 * public synchronized void addStudent(Student s){
		students.add(s);
	   }
	   
	   //ָ��ͬ����
	   public void addStudent(Student s){
	   	synchronized(""){ 
			students.add(s);
		}
	   }
	 */
}
