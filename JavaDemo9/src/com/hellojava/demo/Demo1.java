package com.hellojava.demo;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//Java new IO Java nio non-blocking IO  Java 非阻塞的 IO
		//Java IO IO 阻塞的 read    Java nio 非阻塞 IO 
		//Java IO 面向流      Java nio 面向缓冲区
		//Java IO 不支持选择器    Java nio支持选择器 (网络)
		
		//Java nio 包
		//信道  Channel FileChannel 操作文件通道
		//FileChannel 获得  FileInputStram channel 只能读取
		//FileOutputStream 获得 只能写入
		//RandomAccessFile 获得Model r rw rwd rws  r channel 只能读 rw channel 读和写 
		RandomAccessFile accessFile=new RandomAccessFile("E:\\dd.txt", "rwd");
		FileChannel channel=accessFile.getChannel();
//		System.out.println(channel.size());
		ByteBuffer buffer=ByteBuffer.allocate((int)channel.size());
		
		
//		buffer.put("helloworld".getBytes());
		//buffer.position(0);
		
//		buffer.flip();
		
//		channel.write(buffer);
//		channel.force(false);
		
		//buffer.flip();
		
//		buffer.compact();
//		
//		buffer.put("aabbcc".getBytes());
//		
//		buffer.flip();
//		
//		channel.write(buffer);
//		
//		channel.close();
		
		channel.read(buffer);
//		System.out.println(new String(buffer.array()));
		//反转流
		//buffer.flip();
		//buffer writer
		
//		System.out.println("你好世界".getBytes().length);
		//buffer.capacity();
		//清除buffer中上一次已经写入的数据
//		buffer.compact();
		
		//buffer 已经存在数据(读取原始文件的内容)
		
		
		buffer.compact();
//		buffer.clear();
		buffer.put("你好世界".getBytes());
		//buffer.flip();  position 0  limit=原来的position
		buffer.compact();
		channel.write(buffer);
		channel.close();
		
	}
}
