package com.hellojava.test;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.hellojava.business.IUserService;

public class TestDemo {
	private IUserService userService;
	//BeanFactory�ӽӿ� �¼��Ĵ��� ���ʻ� ��Ϣ��Դ���� 
	private ApplicationContext context;
	//private BeanFactory factory;
	@Before
	public void init() {
		//��ʼ��Springbean����
		//classpath ClassLoader�������(class)
		//ClassPath�ķ�������spring bean�������ļ�(classpath Ĭ�ϵ�ǰ���̵�binĿ¼)
		//context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//�ļ�ϵͳ��·��()
		context=new FileSystemXmlApplicationContext("bin/applicationContext.xml");
		userService=(IUserService) context.getBean("userService1");
	}
	
	@Test
	public void testSave() {
		assertEquals(true, userService.save());
	}

}
