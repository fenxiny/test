public class Demo5 
{
	//全局变量作用域(是在当前类中都能访问)
	//局部变量的作用域(只在于当前方法)
	//全局变量
	static int i=20;
	public static void main(String[] args) 
	{
		//局部变量(可以和全局变量重复)
		//局部变量和全局变量冲突的情况，在局部变量范围内使用冲突的这个变量,
		//一定是使用的是局部变量,在局部变量的范围内把全局变量覆盖
		int i=10;
		System.out.println(i);
		method1(i);
		System.out.println(i);
	}

	public static void print(){
		System.out.println(i);
	}

	//方法的形参是当前方法的局部变量
	public static void method(int i){
		i=100;
	}

	public static int method1(int i){
		i=100;
		return i;
	}

}
