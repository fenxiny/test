package com.hellojava.aspect.impl;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.hellojava.aspect.IAspect;
@Component("myAspect")
@Aspect
public class MyAspect implements IAspect{
	
	@Pointcut("execution(* com.hellojava.business.IBookService.save(..))")
	public void beforePoint() {}
	
	@Pointcut("execution(* com.hellojava.business.IBookService.delete(..))")
	public void arountPoint() {}
	
	@Before("beforePoint()")
	public void before() {
		System.out.println("before");
	}

	@After("beforePoint()")
	public void after() {
		System.out.println("after");
	}

	@Around("arountPoint()")
	public Object arount(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println("事务的开始");
		Object obj=joinPoint.proceed();
		System.out.println("事务开始");
		return obj;
	}

}
