package com.Decathlonplay;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PracticeDecathlonplay {

	@Test
	public void test() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://dosav2performance2.decathlon.in/");
		//link text locater.
		
		driver.findElement(By.linkText("Support")).click();
		String main=driver.getWindowHandle();
		Set<String> allwindowids=driver.getWindowHandles();
		ArrayList<String> copeyids=new ArrayList<>(allwindowids);

		System.out.println(copeyids);
		driver.switchTo().window(copeyids.get(1));
		System.out.println(driver.getWindowHandle());
		Thread.sleep(3000);
		driver.close();
		driver.switchTo().window(copeyids.get(0));
		Thread.sleep(5000);
	// Xpath Locater
		driver.findElement(By.xpath("//span[text()='Shoes']")).click();
	
		// Css Selector.
		Thread.sleep(3000);
		WebElement text=driver.findElement(By.cssSelector("p[class='text-14 text-grey-700']"));

		System.out.println(text.getText());
		//css selector
		driver.findElement(By.cssSelector("*[stroke='currentColor']")).click();
		//class name
		driver.findElement(By.className("flex")).click();
		driver.findElement(By.xpath("//span[@class='aisRefinementListLabelText']/../../../../ul/li[4]/following-sibling::li/following-sibling::li")).click();
		
		
	}
}
