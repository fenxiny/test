package com.hellojava.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hellojava.config.SpringConfiguration;
import com.hellojava.demo.B;

public class Demo {
	public static void main(String[] args) {
		//����Spring��IOC������ʱ��ʹ��AnnotationConfigApplicationContext ����һ��������-->SpringConfiguration
		//ʹ��@Configuration ע���ʶ��һ�������� --> @ImportResource(spring.xml)
		//spring.xml�ļ���ֻ���� <context-component-scan base-package=""> �Զ�ɨ��ָ���İ�
		//ɨ��demo�����е�@Component ��ʶ����(@Component(���)) �Զ��������ʵ��
		//AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		B b=(B) context.getBean("b");
		b.showB();
	}
}
