package com.youtub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrollinginweb {

	public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.tutorialspoint.com/how-to-scroll-a-specific-div-using-selenium-webdriver-with-java#:~:text=Selenium%20cannot%20handle%20scrolling%20directly,of%20xpath%20or%20css%20locator.");
WebElement e=driver.findElement(By.xpath("//*[text()='\"arguments[0].scrollIntoView(true);\"']"));
Actions act=new Actions(driver);
//WebElement e1=driver.findElement(By.xpath("//*[@class='result notranslate']"));
act.moveToElement(e).perform();
//act.scrollByAmount(50,1000).perform();
	}

}
