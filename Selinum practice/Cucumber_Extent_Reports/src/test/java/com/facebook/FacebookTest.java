package com.facebook;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.Browser.LunchBrowser;
import com.Properticefile.Featchdata;

public class FacebookTest extends LunchBrowser {

	public static void main(String[] args)  {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String s=sc.next();
		LunchBrowser.browser(s);
		System.out.println(Featchdata.data("url"));
		driver.get(Featchdata.data("url"));
		Facebookpage login=new Facebookpage(driver);
		login.mail.sendKeys(Featchdata.data("email"),Keys.TAB,Featchdata.data("password"),Keys.ENTER);
        try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
	
	}

}
