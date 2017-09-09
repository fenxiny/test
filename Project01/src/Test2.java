import java.util.Scanner;
public class Test2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		System.out.println("输入数组的长度");
		int length=input.nextInt();
		int[] num=new int[length];
		for(int i=0;i<num.length;i++){
			System.out.println("输入第"+(i+1)+"个元素");
			num[i]=input.nextInt();
		}
		int min=num[0];
		int index=0;
		for(int i=1;i<num
		.length;i++){
			if(min>num[i]){
				index=i;
				min=num[i];
			}
		}
		
		int[] num1=new int[length];
		System.arraycopy(num,index,num1,0,length-index);
		System.arraycopy(num,0,num1,length-index,index);
		
		for(int n : num1){
			System.out.print(n+"\t");
		}
		
	}
}