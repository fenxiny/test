public class Test{
	public static void main(String[] args){
		try{
			int a=args.length;
			int b=42/a;
			int[] c={1};
			c[42]=99;
			System.out.println("b="+b);
		}catch(ArithmeticException e){
		    System.out.println("��0�쳣:"+e);
		}catch(ArrayIndexOutOfBoundsException e){
			 System.out.println("���鳬Խ�߽��쳣��" + e);
		}
	}
}