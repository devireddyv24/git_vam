import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver  driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		//id selector
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mi mobiles");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.CONTROL,"A",Keys.BACK_SPACE);
		
		
		  //css selector
		  
		  driver.findElement(By.cssSelector("input[type='submit']")).click();
		  
		  //name
		  
		  driver.findElement(By.name("low-price")).sendKeys("30000");
		  
		  //className
		  
		  driver.findElement(By.className("a-button-input")).click();
		  
		  //partial link text
		  
		  driver.findElement(By.partialLinkText("Best S")).click();
		  
		  //link text
		  
		  driver.findElement(By.linkText("Mobiles")).click();
		  
		  //Xpath by index
		  
		  driver.findElement(By.xpath(
		  "//div[@id='s-refinements']/../div/div[2]/ul/li[1]")).click();
		  driver.navigate().back();
		  
		  //following-sibling xpath
		  
		  driver.findElement(By.xpath(
		  "//div[@id='s-refinements']/../div/div[2]/following-sibling::div[3]/ul/li[2]"
		  )).click();
		  
		  //preceding-sibling xpath
		  
		  driver.findElement(By.xpath(
		  "//div[@id='s-refinements']/../div/div[2]/following-sibling::div[3]/ul/li[5]/preceding-sibling::li[4]"
		  )).click();
		  
		  //xpath-multiple attribute
		  
		  driver.findElement(By.
		  xpath("//a[@class=\"nav-a  \"][@data-csa-c-slot-id=\"nav_cs_3\"]")).click();
		  
		  //Xpath by partial attribute
		  
			/*
			 * driver.findElement(By.xpath("//img[contains(@alt,'Redmi')]")).click();
			 * 
			 * //xpath by partial text
			 * 
			 * driver.findElement(By.xpath("//h6[contains(text(),' Bank')]")).click();
			 */
        
	}

}
