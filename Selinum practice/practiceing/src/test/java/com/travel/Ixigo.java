package com.travel;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ixigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notification");
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.get("https://www.ixigo.com/");
		d.findElement(By.xpath("//*[text()='Trains']")).click();
		d.findElement(By.xpath("//*[@class='clear-input ixi-icon-cross']")).click();
		WebElement e1=d.findElement(By.xpath("//*[@*='Leaving from']"));
		e1.sendKeys("Kacheguda (KCG)",Keys.TAB,"New Delhi (NDLS)");
		d.findElement(By.xpath("//*[@*=\"depart\"]")).click();
		d.findElement(By.xpath("//*[text()='25']")).click();
		d.findElement(By.xpath("//*[text()=\"Search\"]")).click();

	}

}
