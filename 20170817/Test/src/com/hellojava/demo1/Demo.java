package com.hellojava.demo1;

import com.hellojava.business.IService;
import com.hellojava.business.impl.CoreService;
import com.hellojava.demo.ITask;
import com.hellojava.demo.impl.Task;
import com.hellojava.test.MyHandler;

public class Demo {
	public static void main(String[] args) {
		//ԭʼ���� ����ҵ��
		//IService service=new CoreService();
		//�Ǻ���ҵ��
		//ITask task=new Task();
		//������� (ԭʼ���� �Ǻ���ҵ����� ���� ���ĺͷǺ���ҵ�����һ��)
		//MyHandler handler=new MyHandler(CoreService.class, Task.class);
		//���ɴ������
		//IService service1=(IService) handler.newInstance();
		//service1.service();
		
		
		IService service=new CoreService();
		service.service();
		
		
		//JDK ��̬����  Spring AOP ���� JDK��̬����
		MyHandler handler=new MyHandler(CoreService.class, Task.class);
		IService service1=(IService) handler.newInstance();
		service1.service();
	}
}
