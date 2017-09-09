package com.hellojava.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import com.hellojava.task.ITask;

public class MyMethodAfterAdvice implements AfterReturningAdvice{
	private ITask task;
	public ITask getTask() {
		return task;
	}
	public void setTask(ITask task) {
		this.task = task;
	}
	@Override
	public void afterReturning(Object obj, Method method, Object[] params, Object obj1) throws Throwable {
		task.after();
	}
	
}
