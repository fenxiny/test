package com.hellojava.demo1;
//�̳�ʹ��extends �ؼ��ֶ���
//extends ���Ϊ���� �ұߵ�Ϊ����
//Java�в��õ��̳�(һ����ֻ�ܼ̳�һ������) ����һ������Ա��������̳�
public class Student extends Person
{
	public Student(){
	}
	public Student(String name){
		super(name);
		System.out.println("Student�޲����Ĺ��췽��");
	}

	public void show(){
		System.out.println("����:"+this.name+"�Ա�:"+this.sex+"����"+this.age);
	}

	public void showPersonId(){
		super.personId=100;
		System.out.println(super.personId);
	}
}
