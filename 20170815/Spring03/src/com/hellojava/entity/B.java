package com.hellojava.entity;

public class B {
	private A aa;
	public A getAa() {
		return aa;
	}
	public void setAa(A aa) {
		this.aa = aa;
	}
	public void show() {
		aa.show();
		System.out.println("b");
	}
}
