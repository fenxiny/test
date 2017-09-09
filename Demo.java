public class Demo
{
	public static void main(String[] args) 
	{
		//Java 语言
		//软件(数据)
		//数据(文字,符号,图片,视频,音频,温度,时间)
		//数据的表现形式不同(处理数据) 分类
		//Java 数据分类 --> 类型
		//整数类型
		//字符
		//Java(1:基本数据类型 2:引用数据类型)
		//基本数据类型(1:数值型 2:非数值型)
		//数值型(整型 非整型)
		//100 1000000000 
		//数据存储(计算机数据存储(1:临时性数据(内存) 2:永久性数据(磁盘)))
		//程序中数据(内存) 磁盘(加载到内存)
		//内存占用空间
		//按照数据的存储空间的大小-->类型
		//整型  byte(字节 1个字节空间(8 bit)) 
		//short(短整型) 2字节 0-65535 符号
		//int(整型 ) 4 字节 
		//long (长整型) 8个字节
		//非整型(浮点型) 小数
		//float (单精度浮点型) 4个字节
		//double (双精度浮点型) 8个字节
		//字符型
		//char(字符) 2个字节 ascii(255) unicode(中文 65536)
		//boolean(布尔类型) 1个字节 true(成立)/false(不成立)
		//一个字节(0-255) 符号(-) -128 -- 127 

		//8个 基本数据类型的范畴


		//数据类型(1:数据的分类 2:存储的空间的大小划分)
		//数据存储 变量(Java 程序中数据存储最小单元)
		//定义变量(数据类型 变量名称)
		//声明一个4个字节的空间(空间名称叫age 空间中存储的数据10)
		//int age=10;
		//声明空间
		//一个变量只能定义一次 多次使用
		//改变变量中存储的数据(变量)
		//= 左边是一个空间 
		//age=20;

		//int Age=200;

		//byte b=-128;

		//short s=32767;
		//l 标识当前的数据是long
		//long l=20l;
		//int age1;
		//输出一个变量的时候 输出变量的存储的数据

		//Java 100 默认是int类型  33.44 默认是double
		//33.44f f标识当前的数据是float
		//float f=20.33f;

		//double d=20.33;
		//boolean bool=false;

		//不管是中文还是英文只能是一个
		//char 可以存储ascii码(97 - 122 a-z  65 -- 90 A-Z)
		//char c=65;
		//System.out.println(c);

		//变量 --> 常量
		//只能赋值一次
		//final int NUM;
		//NUM=20;
		//System.out.println(NUM); 

		//命名规范(工程名 类名 每个单词的首字母大写) 
		//方法名称,变量名称(首单词的首字母小写 以后每个单词首字母大写)
		//常量 常量名全大写


		//操作符(运算符)
		//算术运算符(+,-,*,/,%,++,--)
		//int num=50;
		//num++ 先运算在自增 
		//先输出，在自增 10
		//System.out.println(num--);
		//输出上一次自增完的结果 11
		//System.out.println(num);
		//先自增 再输出 11
		//System.out.println(++num);
		//输出的是上次自增后的结果 11
		//System.out.println(num);


		//num=num+20;
		//num+=20;
		//num-=20;
		//num*=10;
		//num/=2;
		//num%=3;
		
		//num=num++;

		
		//关系运算符(> < >= <= == !=)
		//int number=20;
		//关系表达式 返回的是一个boolean类型的值
		//boolean bool=num>number;

		//逻辑运算符(&& || !)(注意:逻辑运算符返回的结果也是boolean 
		//逻辑运算符是用于连接两个或者两个以上的关系表达式的)
		
		//&& 与 (两边都满足)
		//|| 或 (两个满足一个)
		// ! 不是连接多个关系运算符 取反 原本为true 取反false

		//int number=100;

		//boolean bool=1==1;


		//System.out.println(!(num<number));

		//System.out.println(!bool);
		
		//System.out.println(!false);

		//boolean bool=1==1;
		//boolean bool1=10==20;
		
		//&& true && true  true
		//true && false false
		//flase && false false
		//System.out.println(1==1 && 10==10);


		//||  true || true  true
		// true || false true
		//false || false  false

		//System.out.println(1==11 || 10==20);

		//赋值运算符(= += -= *= /= %=)
	
		//位运算符(& |)
		//10 & 2
		//1010 
		//0010
        //0010

		//12 & 3
	    //1100
        //0011

		//System.out.println(1==1 | 10==20);

		//请说出Java中 && & 区别
		//1:&& 作为逻辑运算符 & 可以作为运算符
		// & 也能作为逻辑运算符 & 和 && 在做逻辑运算的时候(&& 短路式逻辑运算 & 非短路式)
		
		//判断

		//程序的处理中(根据一些条件判断)
		/*
		如果(当前时间为8点){
			起床
		}否则{
			继续睡觉	
		}

		if(关系表达式){
			当前关系表达式成立后处理
		}else{
			当前关系表达式不成立的处理	
		}
		
		//else if() 数量不限制
		//if 只能是一个
		//else 只能是一个
		if(关系表达式1){
			当前关系表达式成立后处理
		}else if(关系表达式2){
			当前关系表达式不成立的处理	
		}else if(关系表达式3){
			当前的所有的条件都不满足	
		}else{
			
		}
		

		if(1==1){
			System.out.println("你好");
		}

		if(1==1){

		}else{

		}

		if(){
		}else if(){
		}else{
		}
		*/

		//分支 等额判断 分支比较固定
		//根据当前星期几 来判断做什么事情 
		//switch(变量/表达式) JDK6 byte short int char JDK7 String(字符串)  
		int week=9;
		switch(week){
			case 1:
				System.out.println("星期一");
				break;
			case 2:
				System.out.println("星期二");
				break;
			case 3:
				System.out.println("星期三");
				break;
			case 4:
				System.out.println("星期四");
				break;
			case 5:
				System.out.println("星期五");
				break;
			case 6:
				System.out.println("星期六");
				break;
			case 7:
				System.out.println("星期天");
				break;
			default:
				System.out.println("星期输出不正确");
				break;
		}
		

	}	
}
