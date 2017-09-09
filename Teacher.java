public class Teacher 
{
	public int teacherNumber;
	public String teacherName;
	public String teacherSex;
	public int teacherAge;

	
	public Teacher(){
		System.out.println("无参数的构造方法");
	}

	public Teacher(int teacherNumber){
		System.out.println("一个int参数的构造方法");
		this.teacherNumber=teacherNumber;
	}

	public Teacher(int teacherNumber,String teacherName){
		//在一个构造方法中调用本类的另一个构造方法 必须在当前构造方法中是第一句
		//this() 调用构造方法
		//this() 只能出现在构造方法中
		this(teacherNumber);
		System.out.println("一个TeacherNumber,teacherName参数的构造方法");
		this.teacherName=teacherName;
	}

	public Teacher(int teacherNumber,String teacherName,String teacherSex,int teacherAge){
		this(teacherNumber,teacherName);
		System.out.println("全部参数的构造方法");
		this.teacherSex=teacherSex;
		this.teacherAge=teacherAge;
	}

	

	public String showInfo(){
		return "编号:"+this.teacherNumber+"\t姓名:"+this.teacherName+"\t性别"+this.teacherSex+"\t年龄"+this.teacherAge;
	}
}
