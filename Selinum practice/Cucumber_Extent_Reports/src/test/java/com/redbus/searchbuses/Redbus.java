package com.redbus.searchbuses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.Screenshot.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus extends Extentreportss {
	WebDriver driver;
	
	@Given("Lunch browser and enter url")
	public void lunch_browser_and_enter_url() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	//	reports("D:\\MyFramewok\\mynewframe\\Reports\\redbus10.html");
		
	//	test=repots.createTest("search for buses","readbus");
		driver.get("https://www.redbus.com/");
		Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus1.png",driver);
	 System.out.println("Lunching browser");
	// test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus1.png");
	 
	}

	@When("Enter data in text box")
	public void enter_data_in_text_box() throws InterruptedException, IOException {
	    // Write code here that turns the phrase above into concrete actions
		Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus2.png",driver);
		driver.manage().timeouts().implicitlyWait(4,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[text()='Manage settings']")).click();
		driver.findElement(By.xpath("//*[text()='save']")).click();
		WebDriverWait wit=new WebDriverWait(driver,5);
		wit.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[text()='source']"))).click();
        driver.findElement(By.id("src")).sendKeys("hyderabad");
		
		  driver.findElement(By.xpath("//*[@class='liBpList']/../li[2]")).click();
		//  test.pass("Enter city name in from box");
		  WebElement e1=driver.findElement(By.xpath("//*[text()='destination']"));
		  e1.click(); driver.findElement(By.id("dest")).sendKeys("chenai");
		  Thread.sleep(3000); driver.findElement(By.
		  xpath("//*[@class=\"aligned-item list-item\"]/../../../li[1]")).click();
		//  test.pass("Enter city name in tobox");
		  driver.findElement(By.xpath("//*[@id='date-box']")).click();
		  driver.findElement(By.
		  xpath("//*[@*='DayTiles__CalendarDaysSpan-sc-14em0t0-1 xaHaF']")).click();
		//  test.pass("Enter the date in date box");
		 // test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus2.png");
	}

	@And("click on search box")
	public void click_on_search_box() throws IOException {
		Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus3.png",driver);
		driver.findElement(By.xpath("//*[text()='SEARCH']")).click();
		//test.fail("Clicking in search box");
		//test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus3.png");
	}

	@And("yet another action")
	public void yet_another_action() throws IOException {
		//Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus4.png",driver);
		 driver.findElement(By.xpath("//*[@id=\"rdc-root\"]/div/div[12]/div/div/button[1]")).click();
		// test.fail("search buses");
		// test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus4.png");
	}

	@Then("close the browser")
	public void close_the_browser() throws IOException {
		Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus4.png",driver);
		// test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\redbus4.png");
	  driver.close();
	}

	@And("close the aplication")
	public void close_the_aplication() {
	   driver.quit();
	  // repots.flush();
	}


}
