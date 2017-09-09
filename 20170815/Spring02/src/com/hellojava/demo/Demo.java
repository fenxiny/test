package com.hellojava.demo;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.business.IUserService;
import com.hellojava.business.impl.UserService;
import com.hellojava.dao.IUserDao;

public class Demo {
	public static void main(String[] args) {
		//bean ���� �ڲ� Map ����  ��ʼ��Spring���� ɨ��xml�ļ� �����õ���ǰspringbean���ļ������е�bean��ʼ��
		//(������ϵ) ������ ���� Map  id --> key   ���� -->  value
		//Map<String,Object>
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		//IUserService userService=(IUserService) context.getBean("userService");
		IUserService userService=context.getBean(IUserService.class);
		userService.save();
		
//		IUserDao userDao1=context.getBean(IUserDao.class);
//		userDao1.save();
//		IUserDao userDao2=context.getBean(IUserDao.class);
//		IUserDao userDao3=context.getBean(IUserDao.class);
//		IUserDao userDao4=context.getBean(IUserDao.class);
//		IUserDao userDao5=context.getBean(IUserDao.class);
//		IUserDao userDao6=context.getBean(IUserDao.class);
//		
//		System.out.println(userDao1.hashCode());
//		System.out.println(userDao2.hashCode());
//		System.out.println(userDao3.hashCode());
//		System.out.println(userDao4.hashCode());
//		System.out.println(userDao5.hashCode());
//		System.out.println(userDao6.hashCode());
		
		//Logger logger=Logger.getLogger(clazz)
		
		
//		Student s=context.getBean(Student.class);
//		System.out.println(s);
		
		Cla c=context.getBean(Cla.class);
		c.show();
	}
}
