public class Test1{
	public static void main(String[] args){
		
		int i=3;
		int result=method(i);
		System.out.println(result);
	}
	
	public static int method(int i){
		return i==1?i:2*method(i-1);
	}
}