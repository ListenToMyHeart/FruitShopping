package com.fruit.Utils;


import java.io.IOException;
import java.util.Properties;

public class PropertiesUtil {
	private static Properties properties = null;
	
	private static String configLoc = "properties/tourismService.properties";
	
	static{
		properties = new Properties();
		try {
			properties.load(PropertiesUtil.class.getClassLoader().getResourceAsStream(configLoc));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private PropertiesUtil(){
		
	}
	
	public static String getProperty(String key){
		return properties.getProperty(key);
	}
}
