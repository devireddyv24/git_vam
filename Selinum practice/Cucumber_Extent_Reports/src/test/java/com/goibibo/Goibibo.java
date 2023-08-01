package com.goibibo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.goibibo.com/");
		WebDriverWait wait=new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='Enter city or airport']"))).click();
		driver.findElement(By.xpath("//*[@*='text']")).sendKeys("hyderabad");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@*='autoCompleteTitle ']/../../../../../../../../div[2]/ul/li[2]")).click();
		driver.findElement(By.xpath("//*[@type='text']")).sendKeys("delhi");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@*='autoCompleteTitle ']/../../../../../../li[3]")).click();
		driver.findElement(By.xpath("//*[@*='Fri Jan 27 2023']")).click();
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.xpath("//*[text()='SEARCH FLIGHTS']")).click();
         //List<WebElement> list=driver.findElements(By.xpath("//*[@*='autoCompleteTitle ']/../../../../../../../../div[2]/ul/li"));
         
	}
}