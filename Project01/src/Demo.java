import java.io.IOException;
public class Demo{
	public static void main(String[] args)throws IOException{
		//System.out.println(new Demo().test());
		try{
			return;
		}finally{
			System.out.println("Finally");
		}
	}
	//�����ǰ�����׳����쳣��RunTimeException�¶�����Ҫ����
	public static int test() throws IOException{
		int i=1;
		try{
			i+=3;
			//��¼���˷��ص�����4
			return i;
		}finally{
			i=20;
			return i;
		}
	}
	//������   applet ��ҳ��̬��Ч��  �������װJava�Ĳ��   *.swf
	
}