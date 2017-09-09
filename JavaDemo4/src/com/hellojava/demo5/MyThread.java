package com.hellojava.demo5;

public class MyThread extends Thread{
	//private Object lock;
//	public MyThread(String name,Object lock){
//		super(name);
//		this.lock=lock;
//	}
	
	public MyThread(String name){
		super(name);
	}
	
	@Override
	public void run() {
		//同步块
		//"aabb" 常量字符串(对象) 常量池
		synchronized(this){
			for (int i = 0; i < 10; i++) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				System.out.println(this.getName()+"--"+i);
				
			}
		}
	}
}
