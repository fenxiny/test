package com.hellojava.demo1;
//MyThread ����һ���߳�(�߱���������)
public class MyThread extends Thread{
	public boolean flag=true;
	//�߳�ִ�е�����
	public void run() {
		for (int i = 0; i < 20; i++) {
			//�õ�ǰ���߳���ָͣ����ʱ��(1000 ����)
			if(!flag){
				break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("MyThread:"+i);
		}
	}
}
