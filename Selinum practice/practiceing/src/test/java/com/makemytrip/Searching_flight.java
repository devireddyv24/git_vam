package com.makemytrip;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Searching_flight {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//*[text()='From']")).click();
		driver.findElement(By.xpath("//*[@*='From']")).sendKeys("hyderbad");
		Thread.sleep(3000);
		WebElement ele=driver.findElement(By.xpath("//*[@*='font14 appendBottom5 blackText']/../../../../li[2]"));
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		  js.executeScript("arguments[0].click();", ele);
		  driver.findElement(By.xpath("//*[text()='To']")).click();
		  driver.findElement(By.xpath("//*[@*='To']")).sendKeys("nepal");
		  Thread.sleep(3000);
		  WebElement to=driver.findElement(By.xpath("//*[@class='react-autosuggest__suggestions-list']/li[2]"));
		  js.executeScript("arguments[0].click();", to);
		WebElement date=driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[3]/div[1]/div/div/div/div[2]/div/div[2]/div[2]/div[3]/div[3]/div[7]/div/p"));
		js.executeScript("arguments[0].click();", date);
		WebElement search=driver.findElement(By.xpath("//a[text()='Search']"));
		js.executeScript("arguments[0].click();",search);
		//search.click();
		
		
	}

}
