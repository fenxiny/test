package com.hellojava.demo2;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		Thread1 thread=new Thread1();
		thread.start();
		//start() ��ʼһ���߳� 
		//stop() ��ֹ�߳�
		//interrupt() �ж�(ע��:��ǰ����ֻ���޸����̵߳��жϵ�״̬)
		//interrupt()--> �޸�����Ҫ���жϵ��߳�һ��״̬(����һ���жϵ��ź�)
		//(�����ᴦ���ж�) 
		//interrupt() �����жϵ��ź�(�޸��˵�ǰ�̵߳��ж�״̬)
		//interrupted() ��̬�ķ���(��ȡ��ǰ�̵߳��жϵ��ź� 
		//��ǰ���̱߳��������̷߳������ж��źź�,interrupted()����true,
		//��һ�ε���false �����굱ǰ�ķ�������жϵ�״̬���)
		//isInterrupted() �����ǵ�ǰ�̵߳��жϵ�״̬�������겻�����ǰ�̵߳�
		//�ж�״̬
		//suspend() ����(�߳�û��ִ�����)
		//resume() �ָ�����
		//yield() ��ͣһ��
		//join() �ϲ��߳�
		
		for (int i = 0; i < 20; i++) {
			if(i==10){
				//thread.interrupt();
				//����(���������)
				//thread.suspend();
				//��ͣthread ��mainִ�� �ó�һ��ִ�л���
				//thread.yield();
				//��������̺߳ϲ�һ���߳� thread.join() ���main�ϲ���thread����
				//thread.join();
				//Thread.currentThread().join();
			}
			//if(i==19){
				//�ָ�������߳�
				//thread.resume();
			//}
			Thread.sleep(1000);
			System.out.println("main:"+i);
		}
	}
}
