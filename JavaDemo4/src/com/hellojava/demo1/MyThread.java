package com.hellojava.demo1;
//MyThread 就是一个线程(具备独立运行)
public class MyThread extends Thread{
	public boolean flag=true;
	//线程执行的任务
	public void run() {
		for (int i = 0; i < 20; i++) {
			//让当前的线程暂停指定的时间(1000 毫秒)
			if(!flag){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread:"+i);
		}
	}
}
