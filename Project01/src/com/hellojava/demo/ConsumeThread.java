package com.hellojava.demo;
public class ConsumeThread extends Thread{
	private ProductPool pool;
	public ConsumeThread(ProductPool pool){
		this.pool=pool;
	}
	
	public void run(){
		while(!this.interrupted()){
			pool.consume();
		}
	}
}