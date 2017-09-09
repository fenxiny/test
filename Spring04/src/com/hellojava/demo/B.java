package com.hellojava.demo;

public class B implements BInterface{
//	public AInterface getA() {
//		return a;
//	}
//	public void setA(AInterface a) {
//		this.a = a;
//	}
	private AInterface a;
	
	public B(AInterface a) {
		this.a=a;
	}
	
	public void showB() {
		a.showA();
		System.out.println("showB");
	}
}
