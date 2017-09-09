package com.hellojava.demo;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
public class Test{
	public static void main(String[] args)throws IOException{
		//内存(内存是临时性数据)
		User user=new User();
		user.setUserId(1);
		user.setUserName("张三");
		user.setUserPwd("a111");
		
		//持久存储  (临时性的数据永久保存 过程 持久化) 
		
		//内存的user保存到磁盘(内存 -- 磁盘  输出流)
		//构建一个文件流的一个通道(输出 存储到磁盘)
		
		//序列化(流化) 字节 对象转换成字节(流) (内存的数据---磁盘(字节))
		//正常的对象是不能直接转换成流
		//标识(serrilizab)
		//序列化(内存的对象到磁盘保存)
		FileOutputStream fos=new FileOutputStream("D:\\User.user");
		ObjectOutputStream output=new ObjectOutputStream(fos);
		output.writeObject(user);
		output.flush();
		output.close();
		fos.flush();
		fos.close();
	}
}