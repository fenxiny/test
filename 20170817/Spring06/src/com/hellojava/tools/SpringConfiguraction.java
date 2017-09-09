package com.hellojava.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hellojava.demo.A;
import com.hellojava.demo1.B;
//配置类  spring.xml(配置类 使用AnnotactionApplication)
@Configuration
public class SpringConfiguraction {
	//扫描所有定义的bean注解方法
	//Bean <bean class="A.class">
	//所有标识为bean注解的方法都需要返回一个对象(对象存储在Spring IOC 容器)
	@Bean(name="a")
	public A getA() {
		return new A();
	}
	
	@Bean(name="b")
	public B getB() {
		return new B();
	}
}
