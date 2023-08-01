package com.youtub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtub {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://in.youtube.com/");
		driver.findElement(By.cssSelector("input[name='search_query']")).sendKeys("bending lights");
		driver.findElement(By.xpath("//*[@class='style-scope ytd-searchbox']/../button/yt-icon")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='The Weeknd - Blinding Lights (Official Video)']")).click();
		driver.findElement(By.xpath("//*[@*='nodownload']")).click();

	}

}
