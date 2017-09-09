public class Person 
{
	//在属性和方法定义前添加static关键字 就标识当前的属性或者方法为静态的属性和方法()
	//不同点
	//1:实例属性和实例方法，属于对象(实例)的。创建一个对象就会被复制一份，
	//各自拥有各自的属性和方法,对象和对象之间不影响,当前类被创建了多少对象，
	//实例的属性和方法就会被复制多少份
	//静态的属性和方法，属于类的,类只有一份,那么静态的属性和方法就只会存在一份,
	//被创建的所有的对象共亨 , 不管利用那个对象访问的静态属性和方法都是同一份
	//实例属性(普通属性)

	//2:静态的属性和方法属于类的,静态的属性和方法是在编译阶段就初始,
	//静态的属性和方法早于实例的属性和方法存在(因为实例的属性和方法必须创建对象才初始)
	//在实例方法中能调用静态的属性和方法,但在静态的方法中不能直接调用实例的属性和方法

	//3:静态的属性和方法可以不创建对象通过类名就可以调用
	//  实例的属性和方法必须先创建对象，在利用对象.属性 和 对象.方法() 调用

	//4:在静态的属性和方法中不能使用this关键字
	//  在实例的属性和方法中可以使用this关键字(this当前对象)

	//在静态的方法中调用实例的属性和方法(必须先创建对象，利用对象.属性和对象.方法())
	//静态的方法中调用静态的属性和其他静态的方法 直接调用
	//实例的方法中调用静态的属性和其他静态的方法以及调用实例的属性和其他实例的方法 直接调用
	public String personName;
	//静态属性(类属性)
	public static String school;
	
	//普通方法(实例方法)
	public void showPersonName(){
		//method();
		System.out.println("我叫:"+this.personName+"\t学校是:"+school);
	}
	//
	//静态方法(类方法)
	public static void method(){
		//showPersonName();
		Person p=new Person();
		p.personName="张无忌";
		p.showPersonName();
		System.out.println("我的学校是:"+school);
	}
	
	//运行一次(类加载的时候运行一次)
	//匿名静态块
	static{
		System.out.println("hello static");
	}

	{
		System.out.println("hello"+personName);
	}
}
