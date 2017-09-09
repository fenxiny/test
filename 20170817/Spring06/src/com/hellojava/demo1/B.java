package com.hellojava.demo1;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hellojava.demo.A;
import com.hellojava.demo.A1;
import com.hellojava.demo.AInterface;

public class B implements BInterface{
	@Resource(type=A.class)
	private AInterface a;
	@Override
	public void showB() {
		a.showA();
		System.out.println("B showB()");
	}
	//PostConstruct ◊¢Ω‚ºÊ»› init-method ≈‰÷√
	@PostConstruct
	public void init() {
		System.out.println("B init()");
	}
	//PreDestroy ◊¢Ω‚ºÊ»› destroy-method ≈‰÷√
	@PreDestroy
	public void destroy() {
		System.out.println("B destroy()");
	}
}
