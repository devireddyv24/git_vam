package com.Actions;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
WebDriver d=new ChromeDriver();
d.get("https://www.decathlon.sg/");
d.findElement(By.xpath("//*[text()='Bags']")).click();
/*
 * d.findElement(By.linkText("Switch to")).click();
 * d.findElement(By.xpath("//*[text()='Opens in a new window']")).click();
 * String main=d.getWindowHandle(); Set<String> all=d.getWindowHandles();
 * ArrayList<String> wnds=new ArrayList<>(all);
 * d.switchTo().window(wnds.get(1));
 * d.findElement(By.linkText("Select")).click(); d.close();
 */
	}

}
