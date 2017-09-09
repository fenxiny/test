package com.hellojava.tools;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
/**
 * 读取属性文件得到属性文件的值
 * @author Administrator
 *
 */
public class Configuration {
	//属性文件的类
	private static Properties properties;
	//配置文件的地址
	private static String propertiesFilePath="db.properties";

	public static void setPropertiesFilePath(String propertiesFilePath) {
		Configuration.propertiesFilePath = propertiesFilePath;
	}
	//匿名的静态块(得到配置文件流 属性文件加载)
	static{
		InputStream stream=Configuration.class.getClassLoader().getResourceAsStream(propertiesFilePath);
		if(stream!=null){
			properties=new Properties();
			try {
				properties.load(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void rebuilderProperties() throws FileNotFoundException {
		InputStream stream = Configuration.class.getClassLoader().getResourceAsStream(propertiesFilePath);
		if (stream != null) {
			properties = new Properties();
			try {
				properties.load(stream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			throw new FileNotFoundException("配置文件路径不正确");
		}
	}
	
	public static String getPropertiesValue(String key) throws FileNotFoundException{
		if(properties==null)
			rebuilderProperties();
		return properties.getProperty(key);
	}
	
}
