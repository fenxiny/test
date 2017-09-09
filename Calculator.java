public class Calculator
{
	//在一类中可以存在相同方法名的多个方法(参数一定要不同)
	//判定的标准是参数(返回值不参与当前的判断)
	//参数的不同分为两种:1:参数的数量不同 2:参数的类型不同
	//一个类中存在两个或者两个以上的相同方法名称但是参数不同的方法称为方法重载
	public int calc(int i){
		return i+10;
	}
	public int calc(int i,int j){
		return i+j;
	}

	public double calc(int i,double j){
		return i+j;
	}

	public double calc(double i,int j){
		return i+j;
	}

	public double calc(double i,double j){
		return i+j;
	}

	public String calc(String i,String j){
		return i+j;
	}

	public String calc(String i,double j){
		return i+j;
	}
}
