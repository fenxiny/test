package com.hellojava.demo1;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		//�첽(����ִ��)
		//new �߳� ״̬:����״̬
		MyThread thread=new MyThread();
		//��ʼ�߳�(����һ��ִ������ ִ�е�ǰ�̶߳����run())
		//����start() ״̬:������״̬(�߳� --> ���뵽�̶߳���)
		thread.start();
		//�õ�CPU ״̬:����״̬
		
		//1--10 ���ȼ� (1 ���  10���)
//		Thread.MAX_PRIORITY
		//���õ�ǰ�̵߳����ȼ�
//		thread.setPriority(Thread.MAX_PRIORITY);
		//��õ�ǰ�̵߳����ȼ�
//		thread.getPriority();
		
		//
		
		//����״̬
		
		//run() ִ����� --> ����״̬
		
		for (int i = 20; i < 40; i++) {
			//����״̬(����)
			Thread.sleep(1000);
			if(i==30){
				//�õ�ǰ���߳�����
				//thread.stop();
				thread.flag=false;
			}
			System.out.println("main:"+i);
		}
	}
	//window ������ ���û�  
	//����ִ�� CPU CPU  ���̹���(CPU ʱ�仮�ֳ�С��(ʱ��Ƭ)) 
}
