import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ�����(1900--?)");
		Scanner input=new Scanner(System.in);
		//�ӿ���̨���һ�����ݲ�ת����int���� �洢��year������
		int year=input.nextInt();
		System.out.println("������һ���·�(1--12)");
		int month=input.nextInt();
		//2017 3 
		//1900��1��1�� ����һ 	

		//�����1900 1 1 ���û��������ݺ��·�

		//���������
		int totalDay=0;
		for(int i=1900;i<=year;i++){
			if((i%4==0 && i%100!=0) || (i%400==0)){
				totalDay+=366;
			}else{
				totalDay+=365;
			}
		}

		//���µ�����
		int monthDay=0;
		for(int i=1;i<=month;i++){
			switch(i){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 10:
				case 12:
					monthDay=31;
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					monthDay=30;
					break;
				case 2:
					if((year%4==0 && year%100!=0) || (year%400==0)){
						monthDay=29;
					}else{
						monthDay=28;
					}
					break;
				}
			if(i<month){
				totalDay+=monthDay;
			}
		}

		int week=(totalDay+1)%7;

		System.out.println("������\t����һ\t���ڶ�\t������\t������\t������\t������");

		for(int i=0;i<week;i++){
			System.out.print("\t");
		}

		for(int i=1;i<=monthDay;i++){
			System.out.print(" "+i+"\t");
			if((week+i)%7==0){
				System.out.println();
			}
		}
	}
}
