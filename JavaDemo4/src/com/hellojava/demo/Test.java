package com.hellojava.demo;

public class Test {
	//main执行流程(Java程序默认执行开始位置 线程(主线程))
	//一个进程最少都有一个线程
	public static void main(String[] args) {
		//程序默认都是自上而下逐行执行
		//for没有执行完毕
		for (int i = 0; i < 10; i++) {
			//出现问题(导致暂停)
			System.out.println(i);
		}
		
		//Java多线程
		//第一种:继承Thread类
		//第二种:实现Runnable接口
		
		//同步(线程安全)  异步 并发(线程不安全)
		
		System.out.println("你好世界");
	}
}
