import java.util.Scanner;
public class Demo 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入一个年份(1900--?)");
		Scanner input=new Scanner(System.in);
		//从控制台获得一个数据并转换成int类型 存储到year变量中
		int year=input.nextInt();
		System.out.println("请输入一个月份(1--12)");
		int month=input.nextInt();
		//2017 3 
		//1900年1月1号 星期一 	

		//计算从1900 1 1 到用户输入的年份和月份

		//整年的天数
		int totalDay=0;
		for(int i=1900;i<=year;i++){
			if((i%4==0 && i%100!=0) || (i%400==0)){
				totalDay+=366;
			}else{
				totalDay+=365;
			}
		}

		//整月的天数
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

		System.out.println("星期天\t星期一\t星期二\t星期三\t星期四\t星期五\t星期六");

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
