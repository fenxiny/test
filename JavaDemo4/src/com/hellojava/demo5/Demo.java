package com.hellojava.demo5;

public class Demo {
	public static void main(String[] args) {
		//Object lock=new Object();
		
//		MyThread thread1=new MyThread("thread1",lock);
//		MyThread thread2=new MyThread("thread2",lock);
		
		MyThread thread1=new MyThread("thread1");
		MyThread thread2=new MyThread("thread2");
		//����(�첽)
		thread1.start();
		thread2.start();
		
		//�ı�(ͬ��) ͬһʱ��ֻ��һ���߳�������(�߳��� ͬ����) ������ֻ��һ��
		//��(������߳���ִ��֮ǰ��Ҫ��õ��������������)
	}
}
