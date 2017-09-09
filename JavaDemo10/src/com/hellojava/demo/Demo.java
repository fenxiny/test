package com.hellojava.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//num ����  int ����(����������ȡֵ��Χ�Լ��ܴ洢�����ݸ�ʽ)
		//int num=10;
		//�� ���� (����һ������ class ��������)
		//System s;
		
		//ClassLoder �������  JVM ������� �����߳�  �Ѵ��̵�class�ļ�����JVM 
		//ClassLoader bootStrapClassLoader �������jvm�����jar
		//entendtionClassLoader ��չ��Jar
		//SystemClassLoader �����û������������Jar
		
		
		//class�ļ� class����ʵ��
		
		//class�ļ����   JVM class�ļ�  ��ǰ������class  class����--> class
		//Class �������
		//���Ƕ��������
		//Class ʵ��  class Student.class Student s;
		
		//���һ���������(Class)
		//��һ�ַ�ʽͨ�����class���Եõ���ǰ���Class����ʵ��
		//Class c=User.class;
		//�ڶ���ͨ�������getClass() �����õ���ǰ���Class���ʵ��
		//Class c=new User().getClass();
		//������ͨ��Class��ľ�̬����forName("��İ���+����");
		//Class c=Class.forName("com.hellojava.demo.Demo");
	
		
		//���÷����õ�ǰ������еĶ���(���࣬�ӿڣ��ֶΣ����죬����)
		
		Class c=User.class;
		//c.getName() �����ȫ����
		//System.out.println(c.getName());
		//�õ���ǰ��ķ������η�
		System.out.print(Modifier.toString(c.getModifiers())+" class ");
		System.out.print(c.getSimpleName());
		Class superClass=c.getSuperclass();
		if(!superClass.getSimpleName().equals("Object")){
			System.out.print(" extends ");
			System.out.print(superClass.getSimpleName());
		}
		Class[] interfaces=c.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			if(i==0){
				System.out.print(" implements ");
			}
			String name=i==interfaces.length-1?interfaces[i].getSimpleName():interfaces[i].getSimpleName()+",";
			System.out.print(name);
		}
		System.out.println("{");
		//c.getFields() ��õ�ǰ���з�˽�еĳ�Ա����
		//getDeclaredFields() ���õ�ǰ�������ж���ĳ�Ա����
		//System.out.println(c.getDeclaredFields().length);
		
		Field[] fs=c.getDeclaredFields();
		for(Field f : fs){
			System.out.print("\t"+Modifier.toString(f.getModifiers()));
			System.out.print(" "+f.getType().getSimpleName());
			System.out.println(" "+f.getName()+";");
		}
		
		Constructor[] cons=c.getDeclaredConstructors();
		for(Constructor con : cons){
			System.out.print("\t"+Modifier.toString(con.getModifiers()));
			String conName=con.getName().substring(con.getName().lastIndexOf(".")+1);
			System.out.print(" "+conName+"(");
			Class[] parameters=con.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				String parameter=i==parameters.length-1?parameters[i].getSimpleName()+" args"+i:parameters[i].getSimpleName()+" args"+i+",";
				System.out.print(parameter);
			}
			System.out.println("){}");
		}
		
		Method[] ms=c.getDeclaredMethods();
		for(Method m : ms){
			System.out.print("\t"+Modifier.toString(m.getModifiers()));
			Class returnClass=m.getReturnType();
			System.out.print(" "+returnClass.getSimpleName());
			System.out.print(" "+m.getName()+"(");
			Class[] parameters=m.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				String parameter=i==parameters.length-1?parameters[i].getSimpleName()+" args"+i:parameters[i].getSimpleName()+" args"+i+",";
				System.out.print(parameter);
			}
			System.out.println("){}");
		}
		
		System.out.println("}");
	}
}
