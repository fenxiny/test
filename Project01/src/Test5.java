public class Test5{
	public static void main(String[] args){
		int result=method(5);
		System.out.println(result);
	}
	
	public static int method(int n){
		if(n==1)
			return 10;
		else
			return 2+method(n-1);
	}
}
