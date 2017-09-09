package com.hellojava.demo;

import org.springframework.stereotype.Component;

@Component("a")
public class A {
	public void showA() {
		System.out.println("show A");
	}
}
