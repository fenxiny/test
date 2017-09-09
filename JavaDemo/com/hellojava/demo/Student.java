package com.hellojava.demo;
public class Student 
{
	public static String name="张三";
	public  String src="李四";
	public void method(){
		this.show();
		System.out.println(this.name);
	}

	public static void show(){
		System.out.println("hello");
	}
}
