import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		//num=40 2*2*2*5
		//num=15
		//2*3*3*5
		Scanner input=new Scanner(System.in);
		System.out.println("����һ������:");
		int num=input.nextInt();
		//num=90
		//for ѭ���ĳ���(2....< ����ı�����)
		for(int i=2;i<num;i++){
			while(i!=num){
				if(num%i==0){
					System.out.print(i+"*");s
					num/=i;
				}else{
					break;
				}
			}
		}
		System.out.print(num);
	}
}
