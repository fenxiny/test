package com.hellojava.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
//切面的接口
public interface IAspect {
	public void before();
	public void after();
	public Object arount(ProceedingJoinPoint joinPoint) throws Throwable;
}
