package com.Day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
public static void main(String[] args) {
	// TODO Auto-generated method stub
			WebDriverManager.chromedriver().setup();
			WebDriver d=new ChromeDriver();
			d.get("http://www.uitestpractice.com/");
	d.manage().window().maximize();
	d.findElement(By.linkText("Form")).click();
	d.findElement(By.id("firstname")).sendKeys("vamshi",Keys.TAB,"Devireddy");
	d.findElement(By.xpath("//label[@class='radio-inline'][2]")).click();
	WebElement e2=d.findElement(By.xpath("//*[@value='dance']"));
	e2.click();
	d.findElement(By.xpath("//*[@*='checkbox-inline'][2]")).click();
	d.findElement(By.xpath("//*[@*='checkbox-inline'][3]")).click();
	WebElement e3=d.findElement(By.id("sel1"));
	e3.click();
	Select s=new Select(e3);
	s.selectByVisibleText("Bahrain");
	d.findElement(By.id("datepicker")).click();
	/*WebElement e4=d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1=new Select(e4);
	s1.selectByValue("2000");
	WebElement e5=d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s2=new Select(e5);
	s2.selectByValue("3");
	d.findElement(By.xpath("//*[text()='24']")).click();*/
	d.findElement(By.id("phonenumber")).sendKeys("7093778248");
	WebElement e4=d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1=new Select(e4);
	s1.selectByValue("2000");
	WebElement e5=d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s2=new Select(e5);
	s2.selectByValue("3");
	d.findElement(By.xpath("//*[text()='24']")).click();

	//d.findElement(By.id("phonenumber")).sendKeys("7093778248",Keys.TAB,"vamshidhar",Keys.TAB,"devireddyv22@gmail.com",Keys.TAB,"My name is vamshi i am from amangal",Keys.TAB,"Vamshi@123",Keys.TAB,Keys.ENTER);

	d.findElement(By.xpath("//*[text()='Select']")).click();
	d.findElement(By.linkText("Controls")).click();
	WebElement drog=d.findElement(By.xpath("//*[text()='Drag me to my target']"));
	WebElement drop=d.findElement(By.xpath("//*[text()='Drop here']"));
	Actions act=new Actions(d);
	act.dragAndDrop(drog, drop).perform();
	d.findElement(By.xpath("//a[text()='Click here to watch videos on C#']")).click();
	d.close();
		}
}

