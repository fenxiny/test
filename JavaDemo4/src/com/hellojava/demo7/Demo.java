package com.hellojava.demo7;

public class Demo {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
		
		thread1.start();
		thread2.start();
		//�����ǵ�ǰ�̵߳����������
//		for (int i = 0; i < 20; i++) {
//			Thread.sleep(1000);
//			if(i==3){
//				//ע��:1:wait() ���ñ����������������
//				// 2:������.wait() ���������ͬ������(���ͬ�������������һ��)
//				synchronized (thread1) {
//					thread1.wait();
//				}
//			}
//			System.out.println("main:"+i);
//		}
	}
}
