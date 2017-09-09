package com.hellojava.demo1;

import com.hellojava.business.IService;
import com.hellojava.business.impl.CoreService;
import com.hellojava.demo.ITask;
import com.hellojava.demo.impl.Task;
import com.hellojava.test.MyHandler;

public class Demo {
	public static void main(String[] args) {
		//原始对象 核心业务
		//IService service=new CoreService();
		//非核心业务
		//ITask task=new Task();
		//代理对象 (原始对象 非核心业务对象 任务 核心和非核心业务叠加一起)
		//MyHandler handler=new MyHandler(CoreService.class, Task.class);
		//生成代理对象
		//IService service1=(IService) handler.newInstance();
		//service1.service();
		
		
		IService service=new CoreService();
		service.service();
		
		
		//JDK 动态代理  Spring AOP 基于 JDK动态代理
		MyHandler handler=new MyHandler(CoreService.class, Task.class);
		IService service1=(IService) handler.newInstance();
		service1.service();
	}
}
