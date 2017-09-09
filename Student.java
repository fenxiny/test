public class Student 
{
	//Java文件编写完成 --> 编译(Java--class)
	//Javac在编译当前java文件的时候，会查看当前的类是否存在构造方法
	//如果存在的话，不在做任何的处理
	//如果不存在的话，那么当前编译器会自动给当前类添加一个构造方法(无参数)
	//当前类没有一个构造器

	public int stuId;
	public String stuName;
	public String stuSex;
	public int stuAge;

	//构造方法 也是一个方法 (特殊的方法)
	//1:没有返回值(void) 还不需要使用void标识 (构造方法是不能return数据)
	//2:构造方法的方法名称必须和当前类的类名一致(严格区分大小写)
	//3:构造方法不能显示的调用(在创建对象的时候调用)
	/*
	public Student(int sid,String sname,String sSex,int sAge){
		stuId=sid;
		stuName=sname;
		//写判断
		if(sSex=="男" || sSex=="女"){
			stuSex=sSex;
		}

		if(sAge<=120 && sAge>=0){
			stuAge=sAge;
		}
	}
	*/
	
	//局部变量和全局变量的名称一致
	//局部变量的作用域内局部变量会把全局变量覆盖
	//当前在一个方法内局部变量和全局变量重名的情况下，
	//this.stuId 表示的属性  stuId 标识就是局部变量
	//this Java关键字(标识的当前的对象 我)
	//对象 -->  属性和方法 --> 局部变量
	//局部变量--> 作用域只在于当前块(或者方法)
	public Student(int stuId,String stuName,String stuSex,int stuAge){
		//stuId  stuName stuSex stuAge 全部表示的局部变量
		this.stuId=stuId;
		this.stuName=stuName;
		this.stuSex=stuSex;
		this.stuAge=stuAge;
	}

	public void showInfo(){
		System.out.println("编号:"+this.stuId+"\t姓名:"+this.stuName+"\t性别:"+this.stuSex+"\t年龄:"+this.stuAge);
	}

	public void method(){
		System.out.println("method"+"hello");
		this.showInfo();
	}
}
