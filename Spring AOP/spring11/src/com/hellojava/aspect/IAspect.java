package com.hellojava.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public interface IAspect {
	public void before();
	public void after();
	public Object arount(ProceedingJoinPoint joinPoint) throws Throwable;
}
