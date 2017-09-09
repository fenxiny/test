package com.hellojava.aspect.impl;

import org.aspectj.lang.ProceedingJoinPoint;

import com.hellojava.aspect.IAspect;
//切面实现
public class MyAspect implements IAspect{

	@Override
	public void before() {
		System.out.println("before");
	}

	@Override
	public void after() {
		System.out.println("after");
	}

	@Override
	public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("事务的开始");
		Object obj=joinPoint.proceed();
		System.out.println("事务开始");
		return obj;
	}

}
