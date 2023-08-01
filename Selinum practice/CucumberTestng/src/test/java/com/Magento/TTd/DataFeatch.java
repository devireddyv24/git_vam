package com.Magento.TTd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DataFeatch {
	public static String data(String s) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\MyFramewok\\TestNgreports\\src\\test\\java\\com\\Magento\\TTd\\Magento..properties");
		Properties poj=new Properties();
		poj.load(fis);
		String s1=poj.getProperty(s);
		return s1;
		
		
	}
	public static void main(String[] args) throws IOException {
		//System.out.println(data());
	}

}
