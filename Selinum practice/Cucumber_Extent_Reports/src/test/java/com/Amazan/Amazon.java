package com.Amazan;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		int i=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//ExtentHtmlRporter ehtreport=new ExtentHtmlReporter("D:\\MyFramewok\\mynewframe\\Reports\\amzon.html");
		ExtentReports report=new ExtentReports();
		//report.attachReporter(ehtreport);
		ExtentTest test=report.createTest("Amazon","for multiful screenshot");
		driver.get("https://www.amazon.in/s?k=-amazon&hvadid=72499124504037&hvbmt=be&hvdev=c&hvqmt=e&tag=msndeskstdin-21&ref=pd_sl_5fksc5jb1x_e");
	driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
	TakesScreenshot sh=(TakesScreenshot)driver;
	File src=sh.getScreenshotAs(OutputType.FILE);
	File drs=new File("D:\\MyFramewok\\mynewframe\\Takescrennshots\\amazon"+ i++ +".png");
	Files.copy(src,drs);
		WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
	e.clear();
	e.sendKeys("redmi mobie");
	test.fail("failed to search right product");
	//test.addScreenCaptureFromPath((String) destination);
	System.out.println(driver.getTitle());
	driver.findElement(By.xpath("//*[@*='redmi movie mobile']")).click();
	test.fail("failed to click on product");
	//test.addScreenCaptureFromPath(s);
	//test.addScreenCaptureFromPath((String) destination);
	List<WebElement> ele=driver.findElements(By.xpath("//*[contains(text(),'Redmi Note ')]"));
	System.out.println(ele.size());
	JavascriptExecutor jec=(JavascriptExecutor)driver;
	//jec.executeScript("window.scrollBy(30,400);");
	for (WebElement web : ele) {
		web.click();
		Thread.sleep(3000);
		String main=driver.getWindowHandle();
		Set<String> all=driver.getWindowHandles();
	   ArrayList<String> id=new ArrayList<>(all);
	   int lastid=id.size();
	   driver.switchTo().window(id.get(lastid-1));
	  test.fail("failed to switch to multipul windows");
	 // test.addScreenCaptureFromPath(s);
	  //test.addScreenCaptureFromPath((String) destination);
	   driver.findElement(By.xpath("//*[@*='submit.add-to-cart']")).click();
	   jec.executeScript("window.scrollBy(30,400);");
	   Thread.sleep(3000);
	   driver.navigate().back();
		driver.close();
		driver.switchTo().window(main);
		//report.flush();
		
	}
	}

}
