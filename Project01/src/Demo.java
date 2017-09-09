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
	//如果当前声明抛出的异常是RunTimeException下都不需要处理
	public static int test() throws IOException{
		int i=1;
		try{
			i+=3;
			//记录的了返回的数据4
			return i;
		}finally{
			i=20;
			return i;
		}
	}
	//轻量级   applet 网页动态的效果  浏览器安装Java的插件   *.swf
	
}