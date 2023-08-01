package flifcart;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases extends BaseTest {
	@Test(priority =1)
	public  void mimobiles() throws InterruptedException {
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
	@Test(priority = 2)
	public void sumsung() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("sumsug mobiles",Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("//*[text()='Become a Seller']"));
		String s1=driver.getTitle();
		//Assert.assertEquals(s1,"homepage");
		SoftAssert soft=new SoftAssert();
		AssertJUnit.assertEquals("vamshi","devireddy");
				
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
	@Test(priority = 3)
	public void micromax() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("micromax mobiles",Keys.ENTER);
		WebElement e1=driver.findElement(By.xpath("//*[text()='Become a Seller']"));
		String s1=driver.getTitle();
		//Assert.assertEquals(s1,"homepage");
		/*
		 * SoftAssert sof=new SoftAssert(); AssertJUnit.assertEquals(s1,"homepage");
		 */
				
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
