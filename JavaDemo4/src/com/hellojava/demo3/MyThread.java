package com.hellojava.demo3;

public class MyThread extends Thread{
	//interrupt()--> �޸�����Ҫ���жϵ��߳�һ��״̬(����һ���жϵ��ź�)
	//(�����ᴦ���ж�) 
	//interrupt() �����жϵ��ź�(�޸��˵�ǰ�̵߳��ж�״̬)
	//interrupted() ��̬�ķ���(��ȡ��ǰ�̵߳��жϵ��ź� 
	//��ǰ���̱߳��������̷߳������ж��źź�,interrupted()����true,
	//��һ�ε���false �����굱ǰ�ķ�������жϵ�״̬���)
	//isInterrupted() �����ǵ�ǰ�̵߳��жϵ�״̬�������겻�����ǰ�̵߳�
	//�ж�״̬
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			//����Ƿ��жϱ�����sleep֮ǰ
			if(this.interrupted()){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("mythread:"+i);
		}
	}
}
