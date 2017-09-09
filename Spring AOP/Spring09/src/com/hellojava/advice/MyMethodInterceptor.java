package com.hellojava.advice;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import com.hellojava.business.IBookService;
import com.hellojava.task.ITask;

public class MyMethodInterceptor implements MethodInterceptor{
	private ITask task;
	
	public ITask getTask() {
		return task;
	}
	public void setTask(ITask task) {
		this.task = task;
	}
	
	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {
		task.before();
		Object obj=invocation.proceed();
		task.after();
		return obj;
	}
	
}
