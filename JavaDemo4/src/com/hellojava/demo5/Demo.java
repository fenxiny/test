package com.hellojava.demo5;

public class Demo {
	public static void main(String[] args) {
		//Object lock=new Object();
		
//		MyThread thread1=new MyThread("thread1",lock);
//		MyThread thread2=new MyThread("thread2",lock);
		
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
		//并发(异步)
		thread1.start();
		thread2.start();
		
		//改变(同步) 同一时间只有一个线程能运行(线程锁 同步锁) 锁对象只能一个
		//锁(当多个线程在执行之前先要获得到锁对象才能运行)
	}
}
