package com.hellojava.demo8;

public class MyThread1 extends Thread{
	public MyThread1(String name){
		super(name);
	}
	@Override
	public void run() {
		synchronized ("") {
			for (int i = 0; i < 20; i++) {
				if(i==10){
					try {
						//"".wait();
						Thread.sleep(1000000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
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
