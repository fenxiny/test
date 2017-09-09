package com.hellojava.tools;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.hellojava.demo.A;
import com.hellojava.demo1.B;

@Configuration
public class SpringConfiguraction {
	
	public SpringConfiguraction() {
		System.out.println("SpringConfiguration");
	}
	
	@Bean(name="a")
	public A getA() {
		return new A();
	}
	
	@Bean(name="b")
	public B getB() {
		return new B();
	}
}
