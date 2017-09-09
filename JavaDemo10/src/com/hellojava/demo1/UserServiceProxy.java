package com.hellojava.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//JDK ��̬����(Spring)
//����ҵ��͸���ҵ��ĵ���
public class UserServiceProxy implements InvocationHandler{
	private Class target;
	private Log log;
	
	public UserServiceProxy(Class target,Log log) {
		this.target=target;
		this.log=log;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		log.printLog("��־1");
		Object obj=method.invoke(target.newInstance(), args);
		log.printLog("��־2");
		return obj;
	}
	
	public Object getProxyInstance(){
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getInterfaces(), this);
	}

}
