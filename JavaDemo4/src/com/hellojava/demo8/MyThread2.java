package com.hellojava.demo8;

public class MyThread2 extends Thread{
	public MyThread2(String name){
		super(name);
	}
	@Override
	public synchronized void run() {
		synchronized ("") {
			for (int i = 20; i < 40; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(this.getName()+"---"+i);
			}
		}
	}
}
