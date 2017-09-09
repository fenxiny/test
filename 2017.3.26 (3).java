public class Demo2 
{
	public static void main(String[] args) 
	{
		//c char类型
		//char c='a';
		//用一个int类型变量来接受了char类型数据
		//int num=c;
		//System.out.println(num);

		
//		Java数据类型转换
		//1:自动类型转换
		//发生自动类型转换的条件:
		//1:目标和源数据的数据类型相互兼容
		//2:目标的数据类型大于源数据类型
		
		//short 2字节
		//short s=11;
		//int 4字节 
		//int num=s;

		//2:强制类型转换
		//从大的数据类型转换成小的数据类型
		//int i=10;
		//short num=(short)i;

		//int num=100;
		//char c=(char)num;
		
		//double num=100.922;

		//int num1=(int)num;

		//float f1=222.33f;

		//int num=(int)f1;

		//int num=200;

		//float num1=num;

		//Java 有效数的数据默认是double类型
		//表达式中出现了double 那么结果就是double类型
		//表达式的结果的类型=表达式中出现的数据类型最大的数据类型
		int num=(int)(10*2/3+200.33f);

		System.out.println(num+10);

	}
}
