package com.hellojava.demo7;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
		
		thread1.start();
		thread2.start();
		//必须是当前线程的锁对象调用
//		for (int i = 0; i < 20; i++) {
//			Thread.sleep(1000);
//			if(i==3){
//				//注意:1:wait() 调用必须利用锁对象调用
//				// 2:所对象.wait() 代码必须在同步块中(这个同步块的所对象是一致)
//				synchronized (thread1) {
//					thread1.wait();
//				}
//			}
//			System.out.println("main:"+i);
//		}
	}
}
