package com.hellojava.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.hellojava.task.ITask;

public class MyBeforeAdvice implements MethodBeforeAdvice {
	private ITask task;
	public ITask getTask() {
		return task;
	}
	public void setTask(ITask task) {
		this.task = task;
	}
	@Override
	public void before(Method method, Object[] params, Object obj) throws Throwable {
		task.before();
	}

}
