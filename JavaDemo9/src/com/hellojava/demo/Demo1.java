package com.hellojava.demo;

//import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo1 {
	public static void main(String[] args) throws IOException {
		//Java new IO Java nio non-blocking IO  Java �������� IO
		//Java IO IO ������ read    Java nio ������ IO 
		//Java IO ������      Java nio ���򻺳���
		//Java IO ��֧��ѡ����    Java nio֧��ѡ���� (����)
		
		//Java nio ��
		//�ŵ�  Channel FileChannel �����ļ�ͨ��
		//FileChannel ���  FileInputStram channel ֻ�ܶ�ȡ
		//FileOutputStream ��� ֻ��д��
		//RandomAccessFile ���Model r rw rwd rws  r channel ֻ�ܶ� rw channel ����д 
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
		//��ת��
		//buffer.flip();
		//buffer writer
		
//		System.out.println("�������".getBytes().length);
		//buffer.capacity();
		//���buffer����һ���Ѿ�д�������
//		buffer.compact();
		
		//buffer �Ѿ���������(��ȡԭʼ�ļ�������)
		
		
		buffer.compact();
//		buffer.clear();
		buffer.put("�������".getBytes());
		//buffer.flip();  position 0  limit=ԭ����position
		buffer.compact();
		channel.write(buffer);
		channel.close();
		
	}
}
