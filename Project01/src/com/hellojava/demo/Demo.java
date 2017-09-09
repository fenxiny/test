package com.hellojava.demo;
public class Demo{
	public static void main(String[] args){
		ProductPool pool=new ProductPool();
		ProductionThread production=new ProductionThread(pool);
		ConsumeThread consume=new ConsumeThread(pool);
		production.start();
		consume.start();
	}
}