package com.hellojava.demo1;
//继承使用extends 关键字定义
//extends 左边为子类 右边的为父类
//Java中采用单继承(一个类只能继承一个父类) 但是一个类可以被多个子类继承
public class Student extends Person
{
	public Student(){
	}
	public Student(String name){
		super(name);
		System.out.println("Student无参数的构造方法");
	}

	public void show(){
		System.out.println("名称:"+this.name+"性别:"+this.sex+"年龄"+this.age);
	}

	public void showPersonId(){
		super.personId=100;
		System.out.println(super.personId);
	}
}
