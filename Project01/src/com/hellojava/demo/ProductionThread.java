package com.hellojava.demo;
public class ProductionThread extends Thread{
	private ProductPool pool;
	public ProductionThread(ProductPool pool){
		this.pool=pool;
	}
	
	public void run(){
		while(!this.interrupted()){
			pool.production();
		}
	}
}