package Testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method s
	 WebDriverManager.firefoxdriver().setup();
	 WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	 driver.get(" https://demo.actitime.com/login.do");
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
 driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("manager");
	 driver.findElement(By.xpath("//div[normalize-space()='Login']")).click();
Thread.sleep(4000);
//driver.findElement(By.xpath("//a[@id=\"logoutLink\"]")).click();

//driver.findElement(By.xpath("//td[@class='logoutSeparator']")).click();
		driver.findElement(By.className("logout")).click();

	}

}
