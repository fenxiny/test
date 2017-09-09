import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个年份:");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		System.out.println("请输入一个月份");
		int month=input.nextInt();

		System.out.println((year+100)+"---"+(month+20));


		System.out.println("星期一\t星期二\t星期三\t星期四\t星期五\t星期六\t星期天");
		for(int i=0;i<3;i++){
			System.out.print("\t");
		}
		for(int i=1;i<31;i++){
			System.out.print(" "+i+"\t");
			if((i+3)%7==0){
				System.out.println();
			}
		}
	}
}
