package com.hellojava.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//JDK 动态代理(Spring)
//核心业务和附加业务的叠加
public class UserServiceProxy implements InvocationHandler{
	private Class target;
	private Log log;
	
	public UserServiceProxy(Class target,Log log) {
		this.target=target;
		this.log=log;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.printLog("日志1");
		Object obj=method.invoke(target.newInstance(), args);
		log.printLog("日志2");
		return obj;
	}
	
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getInterfaces(), this);
	}

}
