package cn.edu.xust;

public class TicketSeller {
	private int value=3;  
	public  void judge(String name,int inPut){
		while(inPut/5-1-value>0&&inPut/5!=1){ 
		 try {
			wait();
			System.out.println("不够找钱  "+name+"  等待");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		}
		if(inPut/5==1){
			value++;
			System.out.println(name+"购买成功,不找钱");
			notifyAll();
		} else if(inPut==10){
			  value++;
			  System.out.println(name+"购买成功，找 零："+(inPut-5));
			  notify();
		}else{
			value-=3;
			System.out.println(name+"购买成功，找 零："+(inPut-5));
			 notify();
		}
	}
}
