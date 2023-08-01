package Testng_practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Myproject.practiceing.Lunch_browser;
@Test
public class Testing4 extends Opentsting {
	public void Uplodfile() 
	{
	
	d.get("http://www.uitestpractice.com/");
	d.findElement(By.linkText("Widgets")).click();
	d.findElement(By.xpath("//input[@id='image_file']")).sendKeys("D:\\Test cases for product compare.xlsx");
	d.findElement(By.xpath("//input[@value='Upload']")).click();
	d.findElement(By.linkText("Download a image")).click();
	
	}
	
	
	

}
