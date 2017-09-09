package com.hellojava.task.impl;

import com.hellojava.task.ITask;

public class Task implements ITask{

	@Override
	public void before() {
		System.out.println("before");
	}

	@Override
	public void after() {
		System.out.println("after");
	}

}
