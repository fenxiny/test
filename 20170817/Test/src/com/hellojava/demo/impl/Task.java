package com.hellojava.demo.impl;

import com.hellojava.demo.ITask;

public class Task implements ITask{

	@Override
	public void before() {
		System.out.println("开启事务");
	}

	@Override
	public void after() {
		System.out.println("处理事务");
	}
}
