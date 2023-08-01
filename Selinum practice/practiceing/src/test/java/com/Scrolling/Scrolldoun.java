package com.Scrolling;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolldoun {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.firefoxdriver().setup();
WebDriver driver=new FirefoxDriver();
org.openqa.selenium.Dimension d=new org.openqa.selenium.Dimension(700,600);
driver.manage().window().setSize(d);
driver.get("https://www.flipkart.com/?ef_id=94d80f7dd9071f3434396cb4d3658bec:G:s&s_kwcid=AL!739!10!76484942419895!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
JavascriptExecutor jsc=(JavascriptExecutor)driver;
jsc.executeScript("window.scrollBy(400,0);","");
driver.findElement(By.xpath("//*[text()='✕']")).click();
//JavascriptExecutor jsc=(JavascriptExecutor)driver;
jsc.executeScript("window.scrollBy(0,700);","");
Thread.sleep(3000);
jsc.executeScript("window.scrollBy(400,0);","");
Thread.sleep(3000);
jsc.executeScript("window.scrollBy(0,-700);","");
Thread.sleep(3000);
jsc.executeScript("window.scrollBy(-400,-700);","");

	}

}
