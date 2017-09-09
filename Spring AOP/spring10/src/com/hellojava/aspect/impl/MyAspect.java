package com.hellojava.aspect.impl;

import org.aspectj.lang.ProceedingJoinPoint;

import com.hellojava.aspect.IAspect;
//����ʵ��
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
		System.out.println("����Ŀ�ʼ");
		Object obj=joinPoint.proceed();
		System.out.println("����ʼ");
		return obj;
	}

}
