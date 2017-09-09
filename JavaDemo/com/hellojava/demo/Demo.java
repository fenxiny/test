package com.hellojava.demo;
/*
* 多行注释
* 提供main方法(程序入口)
*
*/
public class Demo 
{
	//单行注释
	public static void main(String[] args) 
	{
		//静态方法和属性 也可以通过对象调用
		//可以通过类名调用
		//静态的是早于对象产生

		//Student s=new Student();
		//s.method();
		//s.show();

		//Student.show();

		//System.out.println(Student.name);

		Student s=new Student();
		s.name="张三";
		s.src="李四";
		
		Student s1=new Student();

		s1.name="王五";
		s1.src="赵六";

		//赋值地址(因为s1本身存储的就是地址)
		s=s1;

		System.out.println(s.name);
		System.out.println(s.src);

		

		System.out.println(s1.name);
		System.out.println(s1.src);
	}
}
