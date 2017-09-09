package com.hellojava.demo3;

public class MyThread extends Thread{
	//interrupt()--> 修改了需要被中断的线程一个状态(发出一个中断的信号)
	//(本身不会处理中断) 
	//interrupt() 发出中断的信号(修改了当前线程的中断状态)
	//interrupted() 静态的方法(获取当前线程的中断的信号 
	//当前的线程被其他的线程发出了中断信号后,interrupted()返回true,
	//下一次调用false 调用完当前的方法会把中断的状态清除)
	//isInterrupted() 返回是当前线程的中断的状态，调用完不清楚当前线程的
	//中断状态
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			//检测是否被中断必须在sleep之前
			if(this.interrupted()){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("mythread:"+i);
		}
	}
}
