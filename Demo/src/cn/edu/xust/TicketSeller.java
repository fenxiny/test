package cn.edu.xust;

public class TicketSeller {
	private int value=3;  
	public  void judge(String name,int inPut){
		while(inPut/5-1-value>0&&inPut/5!=1){ 
		 try {
			wait();
			System.out.println("������Ǯ  "+name+"  �ȴ�");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}  
		}
		if(inPut/5==1){
			value++;
			System.out.println(name+"����ɹ�,����Ǯ");
			notifyAll();
		} else if(inPut==10){
			  value++;
			  System.out.println(name+"����ɹ����� �㣺"+(inPut-5));
			  notify();
		}else{
			value-=3;
			System.out.println(name+"����ɹ����� �㣺"+(inPut-5));
			 notify();
		}
	}
}
