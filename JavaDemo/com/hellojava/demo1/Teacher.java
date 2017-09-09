package com.hellojava.demo1;

public class Teacher extends Person
{
	public Teacher(){
	}
	public Teacher(String name){
		super(name);
		System.out.println("Teacher无参数的构造方法");
	}	
}
