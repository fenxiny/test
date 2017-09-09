package cn.edu.xust;

public class Student extends Thread {
	private TicketSeller t;
	String Name;
	int InPut;
	public Student (String Name,int InPut,TicketSeller t){
	this. Name=Name;
	this. InPut=InPut;
	this.t=t;
	}
	 public void run(){
		 synchronized (t) {
			 t.judge(Name,InPut);
		}
	 }
}
