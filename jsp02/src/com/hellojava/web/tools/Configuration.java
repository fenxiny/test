package com.hellojava.web.tools;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.util.Properties;

public class Configuration {
	private static String configFilePath="/db.properties";
	private static Properties properties;

	public static void setConfigFilePath(String configFilePath) {
		Configuration.configFilePath = configFilePath;
	}
	
	static{
		InputStream inStream=Configuration.class.getResourceAsStream(configFilePath);
		if(inStream!=null){
			properties=new Properties();
			try {
				properties.load(inStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static void rebuilder(){
		InputStream inStream=Configuration.class.getResourceAsStream(configFilePath);
		if(inStream!=null){
			properties=new Properties();
			try {
				properties.load(inStream);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static String getProperty(String key){
		if(properties==null)
			rebuilder();
		return properties.getProperty(key);
	}
}
