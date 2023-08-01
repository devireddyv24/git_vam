package parallel_execusion;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class flifcart {
	@Test
	public void mi() throws InterruptedException { 
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/?ef_id=d0fbd88fea551b2c6883bb5eef0db10f:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
		driver.findElement(By.xpath("//*[text()='✕']")).click();
		driver.findElement(By.name("q")).sendKeys("readme mobiles",Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("//*[text()='Become a Seller']"));
		String s1=driver.getTitle();
		//Assert.assertEquals(s1,"homepage");
	
				
				Actions act=new Actions(driver);
				act.moveToElement(e1).perform();
				Thread.sleep(3000);
				WebElement drog=driver.findElement(By.xpath("//*[@class='_3FdLqY']"));
				act.dragAndDropBy(drog,100,0).perform();
				Thread.sleep(3000);
				Actions act1=new Actions(driver);
		      WebElement drog1=driver.findElement(By.xpath("//*[@class='_3FdLqY']/../../div[2]/div"));
		      act1.dragAndDropBy(drog1,-80, 0).perform();
		
	}
	

}
