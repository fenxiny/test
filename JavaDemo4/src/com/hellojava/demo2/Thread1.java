package com.hellojava.demo2;

public class Thread1 extends Thread{
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if(i==10){
				//this.interrupt();
				//this.suspend();
			}

			System.out.println("thread1:"+i);
		}
	}
}
