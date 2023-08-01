package com.Magento;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.Magento.TTd.DataFeatch;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {
public static	WebDriver driver;
public static WebDriver  browser(String browser) {
	String data=null;
	try {
		data = DataFeatch.data(browser);
		System.out.println(data);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	if(browser.equals("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	else  {
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
	}
	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	return driver;
}
public static void main(String[] args) {
	browser("Browser");
}
}
