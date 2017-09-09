package com.hellojava.demo8;

public class Demo {
	public static void main(String[] args) {
		MyThread1 thread1=new MyThread1("thread1");
		MyThread2 thread2=new MyThread2("thread2");
		
		thread1.start();
		thread2.start();
	}
}
