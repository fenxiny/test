public class Demo5 
{
	//ȫ�ֱ���������(���ڵ�ǰ���ж��ܷ���)
	//�ֲ�������������(ֻ���ڵ�ǰ����)
	//ȫ�ֱ���
	static int i=20;
	public static void main(String[] args) 
	{
		//�ֲ�����(���Ժ�ȫ�ֱ����ظ�)
		//�ֲ�������ȫ�ֱ�����ͻ��������ھֲ�������Χ��ʹ�ó�ͻ���������,
		//һ����ʹ�õ��Ǿֲ�����,�ھֲ������ķ�Χ�ڰ�ȫ�ֱ�������
		int i=10;
		System.out.println(i);
		method1(i);
		System.out.println(i);
	}

	public static void print(){
		System.out.println(i);
	}

	//�������β��ǵ�ǰ�����ľֲ�����
	public static void method(int i){
		i=100;
	}

	public static int method1(int i){
		i=100;
		return i;
	}

}
