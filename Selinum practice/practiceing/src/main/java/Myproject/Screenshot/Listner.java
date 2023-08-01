package Myproject.Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.google.common.io.Files;

import Myproject.practiceing.Lunch_browser;

public class Listner implements ITestListener {
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("testcase number"+result.getName()+"stored",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		Reporter.log("testcase number"+result.getName()+"executed",true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
		TakesScreenshot sh=(TakesScreenshot)Lunch_browser.d;
		File src=sh.getScreenshotAs(OutputType.FILE);
		//File dr=new File("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\src\\main\\java\\Screendshots\\"+result.getName()+".png");
		File dr=new File("D:\\Screenshot"+result.getName()+".png");
		try {
			Files.copy(src, dr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	
		TakesScreenshot sh=(TakesScreenshot)Lunch_browser.d;
		File src=sh.getScreenshotAs(OutputType.FILE);
		File dr=new File("D:\\Screenshot\\"+result.getName()+".png");
		try {
			Files.copy(src, dr);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
