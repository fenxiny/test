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
	//BeanFactory子接口 事件的处理 国际化 消息资源处理 
	private ApplicationContext context;
	//private BeanFactory factory;
	@Before
	public void init() {
		//初始化Springbean容器
		//classpath ClassLoader类加载器(class)
		//ClassPath的方法查找spring bean的配置文件(classpath 默认当前工程的bin目录)
		//context=new ClassPathXmlApplicationContext("applicationContext.xml");
		//文件系统的路径()
		context=new FileSystemXmlApplicationContext("bin/applicationContext.xml");
		userService=(IUserService) context.getBean("userService1");
	}
	
	@Test
	public void testSave() {
		assertEquals(true, userService.save());
	}

}
