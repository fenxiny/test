public class Teacher extends Person
{	
	
	public String name;

	public String show(String name){
		this.name=name;
		return "子类的方法:名字："+this.name;
	}

	public String method(String name){

		return super.show(name);
	}
	
	public void printInfo(String thisName,String superName){

		//super.属性和方法 调用类的属性和方法
		//this.name="张三";
		//System.out.println(this.show());
		
		//this super  this()  super()  this.属性   super.属性   this.方法()  super.方法()

		//this.属性  super.属性 如果当前的属性是在父类中定义的 子类没有定义(当前属性是子类继承父类)
		// this.属性和super.属性是访问的同一个属性
		
		//如果一个属性 父类中定义，子类中也定义  this.属性 super.属性 不是同一个
		this.name=thisName;
		super.name=superName;

		System.out.println(super.name);
		System.out.println(this.name);
	}

	//父类和子类的空间 
	//name 定义父类 子类  

	//两个或者两个以上的具有继承关系的类，在子类中定义的有和父类方法签名一致的方法 

}
