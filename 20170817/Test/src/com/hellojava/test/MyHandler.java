package com.hellojava.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.hellojava.business.IService;
import com.hellojava.demo.ITask;

public class MyHandler implements InvocationHandler{
	private Class serviceClass;
	private Class taskClass;

	public MyHandler(Class serviceClass,Class taskClass) {
		this.serviceClass=serviceClass;
		this.taskClass=taskClass;
		
	}
	
	@Override
	public Object invoke(Object obj, Method method, Object[] params) throws Throwable {
		ITask task=(ITask)taskClass.newInstance();
		task.before();
		Object returnObj=method.invoke(serviceClass.newInstance(), params);
		task.after();
		return returnObj;
	}

	public Object newInstance() {
		return Proxy.newProxyInstance(serviceClass.getClassLoader(), serviceClass.getInterfaces(), this);
	}
}
