public class A 
{
	public void aMethod(){
		System.out.println("a");
	}
}

class B extends A
{
	public void bMethod(){
		System.out.println("b");
	}
}

class C extends B
{
	public void cMethod(){
		System.out.println("c");
	}
	//重写Object类的toString()
	//当输出当前类的对象时候，会自动调用当前对象的toString()方法
	//toString方法只是把当前对象转话成字符串
	public String toString(){
		return "这是c的toString方法";
	}
}

class Test
{
	//继承的传递性
	public static void main(String[] args){
		C c=new C();
		c.aMethod();
		c.bMethod();
		c.cMethod();

		System.out.println(c);

		//Java 中所有的类的父类都是Object
		//Object中定义的方法在所有的对象中都存在
	}
}
