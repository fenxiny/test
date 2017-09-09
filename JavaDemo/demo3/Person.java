public class Person 
{
	public String name;

	public String show(String name){
		this.name=name;
		return "父类的方法:名字："+this.name;
	}
}
