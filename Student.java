public class Student 
{
	//Java�ļ���д��� --> ����(Java--class)
	//Javac�ڱ��뵱ǰjava�ļ���ʱ�򣬻�鿴��ǰ�����Ƿ���ڹ��췽��
	//������ڵĻ����������κεĴ���
	//��������ڵĻ�����ô��ǰ���������Զ�����ǰ�����һ�����췽��(�޲���)
	//��ǰ��û��һ��������

	public int stuId;
	public String stuName;
	public String stuSex;
	public int stuAge;

	//���췽�� Ҳ��һ������ (����ķ���)
	//1:û�з���ֵ(void) ������Ҫʹ��void��ʶ (���췽���ǲ���return����)
	//2:���췽���ķ������Ʊ���͵�ǰ�������һ��(�ϸ����ִ�Сд)
	//3:���췽��������ʾ�ĵ���(�ڴ��������ʱ�����)
	/*
	public Student(int sid,String sname,String sSex,int sAge){
		stuId=sid;
		stuName=sname;
		//д�ж�
		if(sSex=="��" || sSex=="Ů"){
			stuSex=sSex;
		}

		if(sAge<=120 && sAge>=0){
			stuAge=sAge;
		}
	}
	*/
	
	//�ֲ�������ȫ�ֱ���������һ��
	//�ֲ��������������ھֲ��������ȫ�ֱ�������
	//��ǰ��һ�������ھֲ�������ȫ�ֱ�������������£�
	//this.stuId ��ʾ������  stuId ��ʶ���Ǿֲ�����
	//this Java�ؼ���(��ʶ�ĵ�ǰ�Ķ��� ��)
	//���� -->  ���Ժͷ��� --> �ֲ�����
	//�ֲ�����--> ������ֻ���ڵ�ǰ��(���߷���)
	public Student(int stuId,String stuName,String stuSex,int stuAge){
		//stuId  stuName stuSex stuAge ȫ����ʾ�ľֲ�����
		this.stuId=stuId;
		this.stuName=stuName;
		this.stuSex=stuSex;
		this.stuAge=stuAge;
	}

	public void showInfo(){
		System.out.println("���:"+this.stuId+"\t����:"+this.stuName+"\t�Ա�:"+this.stuSex+"\t����:"+this.stuAge);
	}

	public void method(){
		System.out.println("method"+"hello");
		this.showInfo();
	}
}
