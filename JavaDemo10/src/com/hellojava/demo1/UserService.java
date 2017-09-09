package com.hellojava.demo1;

public class UserService implements IUserService{
	//核心业务只是处理核心业务
	public void method(String name){
		System.out.println("业务处理方法"+name);
	}
	
	//商品   包装  商品业务线 核心的业务线   包装的业务线 附加的业务线
	
	//医院  医生  护士  核心业务 附加业务
	
	//1：业务处理方法(){核心业务和附加业务实现} 附加业务侵入到核心业务
	//2:2个对象 医生和护士  治疗(){治疗} 护理(){护理}  两个方法进行调用
	//3:不侵入任何的业务
}
