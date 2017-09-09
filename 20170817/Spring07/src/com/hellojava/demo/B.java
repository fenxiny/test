package com.hellojava.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("b")
public class B {
	@Autowired
	private A a;
	public void showB() {
		a.showA();
		System.out.println("show B");
	}
}
