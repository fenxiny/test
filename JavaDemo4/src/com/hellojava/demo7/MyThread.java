package com.hellojava.demo7;

public class MyThread extends Thread{
	public MyThread(String name){
		super(name);
	}
	@Override
	public synchronized void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
//			if(i==10){
//				try {
//					this.wait();
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
//			}
			//唤醒当前锁对象上wait单个线程
			this.notify();
			//唤醒当前锁对象上的所有的线程
			this.notifyAll();
			
			System.out.println(this.getName()+"---"+i);
		}
	}
}
