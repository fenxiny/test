package com.hellojava.demo.impl;

import com.hellojava.demo.ITask;

public class Task implements ITask{

	@Override
	public void before() {
		System.out.println("��������");
	}

	@Override
	public void after() {
		System.out.println("��������");
	}
}
