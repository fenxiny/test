public class Demo4 
{
	//程序的入口(自定执行) 程序流程发起者
	public static void main(String[] args) 
	{
		//方法(Java 方法 C 函数)
		//方法(作用:使程序模块化 业务描述)
		//万年历(所有业务全部写到main())
		//1:复用性不高
		//2:方法只能描述一个业务(业务最小单位) 业务不可分割(吃饭())

		//描述一个流程(业务)
		//(11,20) 实际参数(实参)
		method(11,20);

	}
	//访问修饰符(public 公共的)
	//static (静态方法)
	//返回值(无返回值 有返回值)
	//无返回值 void 
	//有返回值(确定返回值类型)
	//method 方法名称
	//() 描述方法的参数(可以没有参数)
	//参数(int i) 定义没有赋值
	//(int i,int j)形式参数(形参) 定义
	//只会编译(默认情况下不能被执行 在main函数被调用)
	//返回值是当前方法的出口(结果)
	//参数是当前方法的入口(相当于原材料)
	public static void method(int i,double j){
		//当前方法的方法体(方法体可以是N条程序)
		if(i==10){
			return;
		}
		System.out.println("helloJava");
	}
}
