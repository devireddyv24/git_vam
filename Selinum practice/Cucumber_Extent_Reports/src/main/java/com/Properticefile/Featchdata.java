package com.Properticefile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Featchdata {

	public static void main(String[] args)  {
		System.out.println(data("url"));

	}
	public static  String data(String s)  {
		FileInputStream fis=null;
		try {
			fis = new FileInputStream("D:\\MyFramewok\\mynewframe\\utils\\Fblogin.propertices");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	Properties poj=new Properties();
	try {
		poj.load(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String s1=poj.getProperty(s);
	return s1;
	}

}
