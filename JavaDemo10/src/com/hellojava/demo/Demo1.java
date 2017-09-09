package com.hellojava.demo;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Demo1 {
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
		Class c=User.class;
//		User u=(User)c.newInstance();// new User();
//		u.setUserId(1);
//		u.setUserName("张三");
//		u.setUserPwd("a111");
//		
//		System.out.println(u);
		
		//通过方法名称和参数类型获得一个方法对象
		Method m=c.getMethod("sayHello", new Class[]{String.class});
		//反调用当前方法对象指向的方法(当前方法属于的对象，以及实际参数)
		String name=(String) m.invoke(c.newInstance(), new Object[]{"张三"});
		System.out.println(name);
	}
}
