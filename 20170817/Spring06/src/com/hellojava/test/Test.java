package com.hellojava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.demo.A;
import com.hellojava.demo1.B;
import com.hellojava.tools.SpringConfiguraction;

public class Test {
	
	public static void main(String[] args) {
//		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//		B b=context.getBean(B.class);
//		b.showB();
//		//����SpringIOC������
//		context.destroy();
		//�����е�bean����ʼ��
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguraction.class);
		A a=(A) context.getBean("a");
		a.showA();
	}
}
