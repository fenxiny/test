package com.hellojava.demo3;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread=new MyThread();
		thread.start();
		
		for (int i = 0; i < 20; i++) {
			Thread.sleep(1000);
			if(i==10){
				//�޸�thread�̵߳��жϵ�״̬
				thread.interrupt();
			}
			System.out.println("main:"+i);
		}
	}
}
