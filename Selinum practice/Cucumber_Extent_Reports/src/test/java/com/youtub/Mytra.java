package com.youtub;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mytra {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/womenkurtas-kurtis-suits");
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(4000));
		
		driver.findElement(By.className("brand-more")).click();
		WebElement e=driver.findElement(By.xpath("//*[text()='Jaipur Morni']"));
		Actions act=new Actions(driver);
		act.moveToElement(e).perform();
		

	}

}
