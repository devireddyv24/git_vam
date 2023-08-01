package Stopingadds;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Controladds {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.techlistic.com/p/selenium-tutorials.html");
		WebElement stab=driver.findElement(By.xpath("//*[@class='dropdown']"));
		Actions act=new Actions(driver);
		act.moveToElement(stab).perform();
		driver.findElement(By.xpath("//*[text()='Selenium with TestNG']")).click();
		Thread.sleep(9000);
		
		WebElement add=driver.findElement(By.xpath("//*[@id='dismiss-button']"));
 System.out.println(add.getText());
	}

}
