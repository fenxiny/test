public class Teacher 
{
	public int teacherNumber;
	public String teacherName;
	public String teacherSex;
	public int teacherAge;

	
	public Teacher(){
		System.out.println("�޲����Ĺ��췽��");
	}

	public Teacher(int teacherNumber){
		System.out.println("һ��int�����Ĺ��췽��");
		this.teacherNumber=teacherNumber;
	}

	public Teacher(int teacherNumber,String teacherName){
		//��һ�����췽���е��ñ������һ�����췽�� �����ڵ�ǰ���췽�����ǵ�һ��
		//this() ���ù��췽��
		//this() ֻ�ܳ����ڹ��췽����
		this(teacherNumber);
		System.out.println("һ��TeacherNumber,teacherName�����Ĺ��췽��");
		this.teacherName=teacherName;
	}

	public Teacher(int teacherNumber,String teacherName,String teacherSex,int teacherAge){
		this(teacherNumber,teacherName);
		System.out.println("ȫ�������Ĺ��췽��");
		this.teacherSex=teacherSex;
		this.teacherAge=teacherAge;
	}

	

	public String showInfo(){
		return "���:"+this.teacherNumber+"\t����:"+this.teacherName+"\t�Ա�"+this.teacherSex+"\t����"+this.teacherAge;
	}
}
