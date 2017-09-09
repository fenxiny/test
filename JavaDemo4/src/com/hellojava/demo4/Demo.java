package com.hellojava.demo4;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread=new MyThread();
		//Thread构建(能启动(能调用start()))
		Thread thread1=new Thread(thread);
		//调用start() --- run() 
		// Thread 类的内部定义一个target Runnable
		thread1.start();
		
		for (int i = 0; i < 20; i++) {
			Thread.sleep(1000);
			System.out.println("main:"+i);
		}
	}
}
