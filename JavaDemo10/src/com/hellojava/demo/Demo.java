package com.hellojava.demo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException {
		//num 变量  int 类型(归属变量的取值范围以及能存储的数据格式)
		//int num=10;
		//类 对象 (对象一个变量 class 数据类型)
		//System s;
		
		//ClassLoder 类加载器  JVM 类加载器 独立线程  把磁盘的class文件加载JVM 
		//ClassLoader bootStrapClassLoader 负责加载jvm必需的jar
		//entendtionClassLoader 扩展的Jar
		//SystemClassLoader 加载用户导入第三方的Jar
		
		
		//class文件 class创建实例
		
		//class文件组成   JVM class文件  当前工作的class  class对象--> class
		//Class 类的类型
		//类是对象的类型
		//Class 实例  class Student.class Student s;
		
		//获得一个类的类型(Class)
		//第一种方式通过类的class属性得到当前类的Class类型实例
		//Class c=User.class;
		//第二种通过对象的getClass() 方法得到当前类的Class类的实例
		//Class c=new User().getClass();
		//第三种通过Class类的静态方法forName("类的包名+类名");
		//Class c=Class.forName("com.hellojava.demo.Demo");
	
		
		//利用反射获得当前类的所有的定义(父类，接口，字段，构造，方法)
		
		Class c=User.class;
		//c.getName() 获得是全类名
		//System.out.println(c.getName());
		//得到当前类的访问修饰符
		System.out.print(Modifier.toString(c.getModifiers())+" class ");
		System.out.print(c.getSimpleName());
		Class superClass=c.getSuperclass();
		if(!superClass.getSimpleName().equals("Object")){
			System.out.print(" extends ");
			System.out.print(superClass.getSimpleName());
		}
		Class[] interfaces=c.getInterfaces();
		for (int i = 0; i < interfaces.length; i++) {
			if(i==0){
				System.out.print(" implements ");
			}
			String name=i==interfaces.length-1?interfaces[i].getSimpleName():interfaces[i].getSimpleName()+",";
			System.out.print(name);
		}
		System.out.println("{");
		//c.getFields() 获得当前类中非私有的成员属性
		//getDeclaredFields() 过得当前类中所有定义的成员属性
		//System.out.println(c.getDeclaredFields().length);
		
		Field[] fs=c.getDeclaredFields();
		for(Field f : fs){
			System.out.print("\t"+Modifier.toString(f.getModifiers()));
			System.out.print(" "+f.getType().getSimpleName());
			System.out.println(" "+f.getName()+";");
		}
		
		Constructor[] cons=c.getDeclaredConstructors();
		for(Constructor con : cons){
			System.out.print("\t"+Modifier.toString(con.getModifiers()));
			String conName=con.getName().substring(con.getName().lastIndexOf(".")+1);
			System.out.print(" "+conName+"(");
			Class[] parameters=con.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				String parameter=i==parameters.length-1?parameters[i].getSimpleName()+" args"+i:parameters[i].getSimpleName()+" args"+i+",";
				System.out.print(parameter);
			}
			System.out.println("){}");
		}
		
		Method[] ms=c.getDeclaredMethods();
		for(Method m : ms){
			System.out.print("\t"+Modifier.toString(m.getModifiers()));
			Class returnClass=m.getReturnType();
			System.out.print(" "+returnClass.getSimpleName());
			System.out.print(" "+m.getName()+"(");
			Class[] parameters=m.getParameterTypes();
			for (int i = 0; i < parameters.length; i++) {
				String parameter=i==parameters.length-1?parameters[i].getSimpleName()+" args"+i:parameters[i].getSimpleName()+" args"+i+",";
				System.out.print(parameter);
			}
			System.out.println("){}");
		}
		
		System.out.println("}");
	}
}
