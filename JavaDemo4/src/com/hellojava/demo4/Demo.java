package com.hellojava.demo4;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread=new MyThread();
		//Thread����(������(�ܵ���start()))
		Thread thread1=new Thread(thread);
		//����start() --- run() 
		// Thread ����ڲ�����һ��target Runnable
		thread1.start();
		
		for (int i = 0; i < 20; i++) {
			Thread.sleep(1000);
			System.out.println("main:"+i);
		}
	}
}
