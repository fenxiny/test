public class Demo 
{
	public static void main(String[] args) 
	{
		//定义变量(初始值是1)(作用是控制循环次数)
		//输出1--10 
		//张三 考试 不及格 补考 补考(dowhile循环)
		//dowhile 循环最少执行一次()
		//dowhile 先执行后判断
		/*
		int i=11;
		do{
			System.out.println(i);
			//死循环(循环永远不会结束)
			i++;
		}while(i<=10);
		
		//先判断在执行(一次都不执行)
		int i=11;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		//dowhile while 先执行还是先判断
		初始循环变量
		循环的终止条件
		循环条件的递增
		
		
		for(int i=1;i<=10;i++){
			System.out.println(i);
		}

		

		int i=1;
		for(;i<=10;){
			System.out.println(i);
			i++;
		}
		

		int i=1;
		for(;;){
			if(i>10){
				//退出循环
				//退出当前的循环
				//退出当前循环
				break;
			}
			System.out.println(i);
			i++;
		}

		
		//\t 表示一个制表符(TAB)
		//控制行
		for(int i=1;i<10;i++){
			//控制列
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<10;i++){
			for(int j=10;j-i>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}

		
		//输出每行前面的空格
		for(int i=1;i<10;i++){
			for(int j=1;j<i;j++){
				System.out.print(" ");
			}
			for(int j=10;j-i>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		

		for(int i=1;i<10;i++){
			for(int j=10;j-i-1>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		*/


		//菱形
		/*
		for(int i=1;i<=5;i++){
			for(int j=5;j-i>0;j--){
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		for(int i=1;i<5;i++){
			for(int j=1;j<=i;j++){
				System.out.print(" ");
			}
			for(int j=9;j-(2*i)>0;j--){
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		//从1加到100
		/*
		int result=0;
		for(int i=1;i<=100;i++){
			result+=i;
		}
		System.out.println(result);
		*/

		//while 一般判断是范围
		//for 一般是循环次数比较确定

		//数组(相同类型多个变量)
		//大小
		//申明
		//int[] nums;
		//分配40个字节的连续的空间 nums存储这个40个字节空间的首地址
		//nums=new int[10];
		//位置(下标) 0  --  length-1

		/*
		int[] nums=new int[10];
		nums[0]=10;
		nums[1]=20;
		nums[9]=300;


		int[] nums1={1,2,3,4,5,6,7,78,8,9};

		int[] nums2=new int[]{1,2,3,4,5,6,76,7,8};
		*/
		//可以运行(但是不推荐使用)
		//数组是一种数据类型
		//int nums3[]={1,2,3,4,5,6,7,8,9};
		/*
		for(int i=0;i<nums3.length;i++){
			System.out.println(nums3[i]);
		}
		*/

		//for(int n : nums3){
		//	System.out.println(n);
		//}




	}	

}
