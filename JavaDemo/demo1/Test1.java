package demo1;
public class Test1 
{
	public void show(Object str){
		System.out.println(str);
	}


	public static void main(String[] args) 
	{
		//Test1 t=new Test1();
		//t.show(new Demo());

		//����
		//��װ
		//�̳�
		//��̬

		//Object obj=new Demo();

		//int i=(int)10.22;

		//double d=10;

		//Test1 tt=new Demo();
		//Java �����Ϊ 1:����ʱ����(�﷨����) 2:����ʱ����(�쳣) 
		//�����쳣
		//Demo dd=(Demo)new Object();

		//�ϲ�������ָ���²���Ŀռ�

		//�ϲ�Ķ���ķ���  �²����ķ���
		//��̬ �ϲ����ָ����²�ռ�(�ϲ����ķ���Ϊ׼(�ϲ�����еķ������ܵ���))
		//ȷ�����ö��Ǵ���
		//Object obj=new Test1();
		//obj.show();

		//Test1 tt=new Object();
		//tt.show();

		//Object obj=new Test1();

		//Test1 t=new Test1();
		//t.method(�����ܴ���);


		
		Student s=new Student();
		Student s1=new Student();
		//s==s1 s��s1�洢�ĵ�ַ�ǲ���һ��
	}

	public boolean equals(Object obj){
		
	}

	//��������̬
	public void method(Object obj){
		
	}
	//����ֵ��̬
	public Object getInstance(){
		return new Test1();
	}
}