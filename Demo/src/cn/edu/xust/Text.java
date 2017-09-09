package cn.edu.xust;
public class Text{

 public static void main(String[] args) {
	 TicketSeller h=new TicketSeller();
	  Student A3=new Student("ÕÔÄ³",5,h);Student A1=new Student("ÕÅÄ³",20,h);
	 Student A2=new Student("ÀîÄ³",10,h);
	
     A1.start();
     A2.start();
     A3.start();
 }

}