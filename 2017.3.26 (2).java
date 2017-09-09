public class Demo1 
{
	public static void main(String[] args) 
	{
		//数组(同一类型的多个变量的时候)
		//同一类型
		//只能存放int类型的数据
		//相当于一次性定义了10个int类型变量
		//创建的10个int类型的变量的空间地址赋给nums
		//(指向一个连续的40个字节的空间(按照4个字节为一个单位分配))
		int[] nums=new int[10];
		//把第一个小空间的内部存储为10
		//[0,1,2] 标识当前空间的位置
		nums[0]=10;
		nums[1]=20;

		int[] nums={1,2,3,4,5,6,7,8};

		int[] nums=new int[]{1,3,4,5,6,7,8,9};

		System.out.println(nums[0]+nums[1]);

		int number=10;

	}
}
