public class Teacher extends Person
{	
	
	public String name;

	public String show(String name){
		this.name=name;
		return "����ķ���:���֣�"+this.name;
	}

	public String method(String name){

		return super.show(name);
	}
	
	public void printInfo(String thisName,String superName){

		//super.���Ժͷ��� ����������Ժͷ���
		//this.name="����";
		//System.out.println(this.show());
		
		//this super  this()  super()  this.����   super.����   this.����()  super.����()

		//this.����  super.���� �����ǰ���������ڸ����ж���� ����û�ж���(��ǰ����������̳и���)
		// this.���Ժ�super.�����Ƿ��ʵ�ͬһ������
		
		//���һ������ �����ж��壬������Ҳ����  this.���� super.���� ����ͬһ��
		this.name=thisName;
		super.name=superName;

		System.out.println(super.name);
		System.out.println(this.name);
	}

	//���������Ŀռ� 
	//name ���常�� ����  

	//���������������ϵľ��м̳й�ϵ���࣬�������ж�����к͸��෽��ǩ��һ�µķ��� 

}
