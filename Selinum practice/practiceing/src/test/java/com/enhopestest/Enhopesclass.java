package com.enhopestest;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enhopesclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		
		ExtentHtmlReporter eth=new ExtentHtmlReporter("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Reports\\Enhops1.html");
        ExtentReports re=new ExtentReports();
        re.attachReporter(eth);
        ExtentTest test=re.createTest("Enops link","homepage");
		d.get("https://www.enhops.com/");
		String s=Scerenshot.getscreenshot(d);
		test.pass("enter the enhops url");
		Enhopspage en=new Enhopspage(d);
		Actions act=new Actions(d);
		act.moveToElement(en.res).perform();
		test.pass("element as shown");
		en.blog.click();
		//test.pass("click on clg");
		//en.link.click();
		test.fail("Element not found");
		try {
			test.addScreenCaptureFromPath(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		re.flush();

	}

}
