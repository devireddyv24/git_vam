package Actitime.TestCases.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ActitimeDatafeatch {
	public static String data(String data) throws IOException {
		FileInputStream fis=new FileInputStream("D:\\MyFramewok\\TestNgreports\\src\\test\\java\\Actitime\\TestCases\\properties\\Actitime.properties");
		Properties poj=new Properties();
		poj.load(fis);
		String s=poj.getProperty(data);
		return s;
	}
	public static void main(String[] args) throws IOException {
		System.out.println(data("url"));
	}
	

}
