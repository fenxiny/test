public class Test 
{
	public static void main(String[] args) throws Exception
	{
		//Java () 方法

		//new Stduent() 调用一个方法(构造方法)
		//构造方法() 在创建当前对象的时候调用
		//创建对象的时候一定会去调用当前类的构造方法
		//运行阶段(每个类一定保证了有一个构造方法)
		//定义的类，默认情况都一定能创建对象

		//先创建对象才能去调用属性和方法
		//一般可以在构造方法去初始化当前的对象

		//程序的运行自上而下逐行执行(一次执行一行)
		//Student s=new Student(1,"张三","男",230);
		//Student s1=new Student(2,"李四","女",25);

		//s.method();
		//s1.method();

		/*
		for(int i=1;i<=10;i++){
			//i 相当于for的块局部变量
			System.out.println(i);
		}

		System.out.println(i);
		*/

		//一个类中出现两个或两个以上的方法的处理类似，但根据参数不同调用不同的方法
		//Calculator calc=new Calculator();
		//调用方法(不用管调用的是哪一个方法(只需要给参数) 
		//系统会自动根据实参匹配调用相应的方法)
		//int num=calc.calc(20);
		//System.out.println(num);

		//Teacher t=new Teacher();
	
		//Demo d=new Demo();

		//Teacher t=new Teacher();
		//String info=t.showInfo();
		//System.out.println(info);


		//Person p=new Person();
		//p.personName="张三";
		//p.school="北京大学";
		
		//Person p1=new Person();
		//p1.personName="李四";
			
		//p1.school="清华大学";

		//school 属性 不管使用哪个对象改变了school的值，其他对象都收到影响
		//personName 属性 利用其他对象改变了personName的值 当前对象不受影响

		//p.showPersonName();
		//p.method();
		//p1.method();


		//Person.school="北京大学";
		//Person.method();

		//Class c=Person.class;
		
		//ClassLoader 负责把磁盘的class文件加载到内存
		//Class.forName("Person");
		//Person.method();


		System.out.println("hello 普通main的代码");
		//才加载Person类
		Person p=new Person();
		Person p1=new Person();
		
		{
			System.out.println("hello Main");
		}

		//Person.personName="张三";
		//Person.showPersonName();
	}
}
