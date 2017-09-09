package com.hellojava.demo2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread=new Thread1();
		thread.start();
		//start() 开始一个线程 
		//stop() 终止线程
		//interrupt() 中断(注意:当前方法只是修改了线程的中断的状态)
		//interrupt()--> 修改了需要被中断的线程一个状态(发出一个中断的信号)
		//(本身不会处理中断) 
		//interrupt() 发出中断的信号(修改了当前线程的中断状态)
		//interrupted() 静态的方法(获取当前线程的中断的信号 
		//当前的线程被其他的线程发出了中断信号后,interrupted()返回true,
		//下一次调用false 调用完当前的方法会把中断的状态清除)
		//isInterrupted() 返回是当前线程的中断的状态，调用完不清楚当前线程的
		//中断状态
		//suspend() 挂起(线程没有执行完成)
		//resume() 恢复挂起
		//yield() 暂停一次
		//join() 合并线程
		
		for (int i = 0; i < 20; i++) {
			if(i==10){
				//thread.interrupt();
				//挂起(会造成死锁)
				//thread.suspend();
				//暂停thread 让main执行 让出一次执行机会
				//thread.yield();
				//会把两个线程合并一个线程 thread.join() 会把main合并到thread后面
				//thread.join();
				//Thread.currentThread().join();
			}
			//if(i==19){
				//恢复挂起的线程
				//thread.resume();
			//}
			Thread.sleep(1000);
			System.out.println("main:"+i);
		}
	}
}
