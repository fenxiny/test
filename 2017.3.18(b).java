import java.util.Scanner;

public class Demo1 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ�����:");
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		System.out.println("������һ���·�");
		int month=input.nextInt();

		System.out.println((year+100)+"---"+(month+20));


		System.out.println("����һ\t���ڶ�\t������\t������\t������\t������\t������");
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
