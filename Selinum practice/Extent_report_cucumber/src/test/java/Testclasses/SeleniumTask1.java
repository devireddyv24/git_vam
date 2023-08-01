package Testclasses;



import java.awt.AWTException;
import java.util.ArrayList;
import java.util.Set;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class SeleniumTask1 {
	public static WebDriver driver;
	public static Actions act;
	public static JavascriptExecutor jsc;
	public static ArrayList<String> wids;
	@Given("I want to Navigate to web application.")
	public void i_want_to_navigate_to_web_application() {
		driver=Browser.broser();
		driver.get("file:///D:/Api/Vmshi.html");
		driver.manage().window().maximize();
		
	}

	@And("I want to Open new window page and navigate to url")
	public void i_want_to_open_new_window_page_and_navigate_to_url() throws InterruptedException {
		driver.findElement(By.xpath("//a[text()='vamshi']")).click();
		//Find the main window id
		String mainid=driver.getWindowHandle();
		//Find the all the windows ids
		Set<String> all=driver.getWindowHandles();
		 wids=new ArrayList<>(all);
		//Print the number of windows is available
		System.out.println(wids.size());
		//driver switch to second window
		driver.switchTo().window(wids.get(1));
		//Click on next function in second window
		driver.findElement(By.linkText("Next ❯")).click();
		//navigate to url
		driver.navigate().to("file:///D:/Api/Vmshi.html");
		
		
	}
	@And("use navigation-commands")
	public void use_navigation_commands() throws InterruptedException, AWTException {
		Thread.sleep(3000);
		//Navigate back
driver.navigate().back();
//navigate forward
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
//navigate refresh
driver.navigate().refresh();
driver.navigate().to("http://www.uitestpractice.com/");
Thread.sleep(3000);



	}
	@And("Practice Actions class")
	public void practice_actions_class() throws InterruptedException {
		WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
		WebElement drop=driver.findElement(By.xpath("//p[text()='Drop here']"));
		 act=new Actions(driver);
		 //Drog and drop
		act.dragAndDrop(drag, drop).perform();
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double Click ME !']"));
		//double click
		act.doubleClick(doubleclick).perform();
		//Alert  Switching
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//Right click
		act.contextClick().perform();
		Thread.sleep(3000);
	}

	@And("Widow scrolling using Javascript")
	public void widow_scrolling_using_javascript() {
		//Scrolling doun
	 jsc=(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(3000,100);");
		driver.navigate().back();
		jsc.executeScript("window.scrollBy(5000,100);");
		
		
	}


	@And("Keys class in sendkeys")
	public void keys_class_in_sendkeys() {
		//Using keys that copy and paste
		 WebElement keysclass=driver.findElement(By.id("fname"));
		 keysclass.clear();
		 keysclass.sendKeys("Vamshidhar",Keys.CONTROL,"A");
		 keysclass.sendKeys(Keys.CONTROL,"C");
		 keysclass.sendKeys(Keys.TAB,Keys.CONTROL,"A",Keys.BACK_SPACE);
		 keysclass.sendKeys(Keys.TAB,Keys.CONTROL,"V");
		 driver.switchTo().window(wids.get(0));
		 //verify the driver switch to main window
		// org.junit.jupiter.api.Assertions.assertEquals(driver.getWindowHandle(),wids.get(0));
		 driver.close();
		 driver.switchTo().window(wids.get(1));
		 //verifying the driver is switch to second window
		//org.junit.jupiter.api.Assertions.assertEquals(driver.getWindowHandle(),wids.get(1));

	}
	@And("select element  from dropdown")
	public void select_element_from_dropdown() throws InterruptedException {
		//select single element
	  WebElement sel=driver.findElement(By.id("cars"));
	  Select s=new Select(sel);
	  s.selectByValue("saab");
	boolean b=  driver.findElement(By.xpath("//*[text()='Saab']")).isSelected();
	//assertion is true
	
	System.out.println(b);
	  //select mutliple elements and deselect
	  WebElement sel1=driver.findElement(By.xpath("//*[@*='300']")); 
	  Select s2=new Select(sel1);
	  s2.selectByIndex(0);

	  s2.selectByIndex(2);
	  s2.selectByIndex(4);
	  Thread.sleep(3000);
	  //deselect
	  s2.deselectByIndex(2);
	  Thread.sleep(3000);
	 driver.findElement(By.id("vamshii")).click();
	  
	}

}
