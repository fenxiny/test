package com.hellojava.demo;
import java.util.Stack;
import java.util.Random;
import java.util.concurrent.locks.*;

public class ProductPool{
	//��
	private Lock lock=new ReentrantLock();
	Condition productionCondition=lock.newCondition();
	Condition consumeCondition=lock.newCondition();
	private Stack<Product> stack=new Stack<Product>();
	private int id;
	private Random random=new Random();
	public void production(){
		//����
		lock.lock();
		try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		if(stack.size()>=10){
			consumeCondition.signal();
			try{
				productionCondition.await();
			}catch(InterruptedException e){
				
			}
		}
		Product p=new Product();
		id++;
		p.setProductId(id);
		p.setProductName("��Ʒ"+id);
		stack.addElement(p);
		System.out.println("����������"+p);
		lock.unlock();
	}
	
	public void consume(){
		lock.lock();
		try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				
			}
		if(stack.size()<=0){
			productionCondition.signal();
			try{
				consumeCondition.await();
			}catch(InterruptedException e){
				
			}
		}
		int index=random.nextInt(stack.size());
		Product p=stack.get(index);
		System.out.println("����������:"+p);
		stack.remove(p);
		id--;
		lock.unlock();
	}
	
}