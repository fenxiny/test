package com.hellojava.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c=User.class;
//		User u=(User)c.newInstance();// new User();
//		u.setUserId(1);
//		u.setUserName("����");
//		u.setUserPwd("a111");
//		
//		System.out.println(u);
		
		//ͨ���������ƺͲ������ͻ��һ����������
		Method m=c.getMethod("sayHello", new Class[]{String.class});
		//�����õ�ǰ��������ָ��ķ���(��ǰ�������ڵĶ����Լ�ʵ�ʲ���)
		String name=(String) m.invoke(c.newInstance(), new Object[]{"����"});
		System.out.println(name);
	}
}
