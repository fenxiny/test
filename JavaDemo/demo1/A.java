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
	//��дObject���toString()
	//�������ǰ��Ķ���ʱ�򣬻��Զ����õ�ǰ�����toString()����
	//toString����ֻ�ǰѵ�ǰ����ת�����ַ���
	public String toString(){
		return "����c��toString����";
	}
}

class Test
{
	//�̳еĴ�����
	public static void main(String[] args){
		C c=new C();
		c.aMethod();
		c.bMethod();
		c.cMethod();

		System.out.println(c);

		//Java �����е���ĸ��඼��Object
		//Object�ж���ķ��������еĶ����ж�����
	}
}
