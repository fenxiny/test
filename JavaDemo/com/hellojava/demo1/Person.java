package com.hellojava.demo1;
public class Person extends Animal
{
	public String name;
	public String sex;
	public int age;
	private int personId;

	public static String school;

	public Person(){
	}

	public Person(String name){
		System.out.println("Person�޲����Ĺ��췽��");
	}

	public void eat(){
		System.out.println(this.name+"���ڳԷ�");
	}
}
