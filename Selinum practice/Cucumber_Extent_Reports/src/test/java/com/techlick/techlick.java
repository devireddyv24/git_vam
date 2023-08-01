package com.techlick;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class techlick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
		Actions  act=new Actions(driver);
		WebElement seleniumtab=driver.findElement(By.className("dropbtn"));
		act.moveToElement(seleniumtab).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[1]")).click();
       WebDriverWait wait=new WebDriverWait(driver,5);
      // wait.until(ExpectedConditions.elementToBeClickable(seleniumtab1));
       Thread.sleep(8000);
       WebElement seleniumtab1=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab1).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[2]")).click();
       Thread.sleep(8000);
       WebElement seleniumtab2=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab2).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[3]")).click();
       Thread.sleep(8000);
       WebElement seleniumtab3=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab3).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[4]")).click();
       Thread.sleep(8000);
       WebElement seleniumtab4=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab4).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[5]")).click();
       Thread.sleep(8000);
       WebElement seleniumtab5=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab5).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[6]")).click();
       Thread.sleep(8000);
       WebElement seleniumtab6=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab6).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[7]")).click();

	}

}
