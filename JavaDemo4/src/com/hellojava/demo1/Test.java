package com.hellojava.demo1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//异步(并发执行)
		//new 线程 状态:就绪状态
		MyThread thread=new MyThread();
		//开始线程(开辟一个执行流程 执行当前线程对象的run())
		//调用start() 状态:可运行状态(线程 --> 进入到线程队列)
		thread.start();
		//得到CPU 状态:运行状态
		
		//1--10 优先级 (1 最低  10最高)
//		Thread.MAX_PRIORITY
		//设置当前线程的优先级
//		thread.setPriority(Thread.MAX_PRIORITY);
		//获得当前线程的优先级
//		thread.getPriority();
		
		//
		
		//阻塞状态
		
		//run() 执行完毕 --> 死亡状态
		
		for (int i = 20; i < 40; i++) {
			//阻塞状态(休眠)
			Thread.sleep(1000);
			if(i==30){
				//让当前的线程死亡
				//thread.stop();
				thread.flag=false;
			}
			System.out.println("main:"+i);
		}
	}
	//window 多任务 多用户  
	//代码执行 CPU CPU  进程管理(CPU 时间划分成小段(时间片)) 
}
