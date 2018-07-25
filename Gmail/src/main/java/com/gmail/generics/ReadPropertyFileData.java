package com.gmail.generics;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ReadPropertyFileData {
	public static String getPropertyValue(String path, String key)
	{
		String value=null;
		Properties properties= null;
		try {
			FileInputStream fileInputStream = new FileInputStream(path);
			properties= new Properties();
			properties.load(fileInputStream);
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		value= properties.getProperty(key);
		return value;
		
		
	}

}
