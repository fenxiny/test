package com.hellojava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.config.SpringConfiguration;
import com.hellojava.demo.B;

public class Demo {
	public static void main(String[] args) {
		//创建Spring的IOC的容器时候使用AnnotationConfigApplicationContext 加载一个配置类-->SpringConfiguration
		//使用@Configuration 注解标识是一个配置类 --> @ImportResource(spring.xml)
		//spring.xml文件中只存在 <context-component-scan base-package=""> 自动扫描指定的包
		//扫描demo包所有的@Component 标识的类(@Component(组件)) 自动创建类的实例
		//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		B b=(B) context.getBean("b");
		b.showB();
	}
}
