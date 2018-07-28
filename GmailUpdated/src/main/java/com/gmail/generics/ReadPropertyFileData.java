package com.gmail.generics;
import java.io.FileInputStream;
import java.util.Properties;
public class ReadPropertyFileData implements Auto_Constants{
	public static String getPropertyValue(String path, String key)
	{
		String value="";
		try {
			FileInputStream fis = new FileInputStream(INPUTPROPERTY_PATH);
			Properties pr= new Properties();
			pr.load(fis);
			value= pr.getProperty( key);
		} 
		catch (Exception e)
		{
		}
		return value;


	}

}
