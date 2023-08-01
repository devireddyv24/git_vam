package com.techlick;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtab {
	public WebDriver driver;
	public  Actions  act;
	@Given("I launched a browser")
	public void i_launched_a_browser() {
	   System.out.println("i lunched the browser");
	   WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	@And("I navigate to Techlistic")
	public void i_navigate_to_techlistic() {
	    System.out.println("I navigate to tech");
	    driver.get("https://www.techlistic.com/");
		driver.manage().window().maximize();
	}

	@When("I perform Mouse Hover action on SELENIUM Tab")
	public void i_perform_mouse_hover_action_on_selenium_tab() {
	   System.out.println("i perform mouse ower");
	   act=new Actions(driver);
		WebElement seleniumtab=driver.findElement(By.className("dropbtn"));
		act.moveToElement(seleniumtab).perform();
	}

	@And("I click SELENIUM WITH JAVA")
	public void i_click_selenium_with_java() {
	  System.out.println("I click on selenium with java");
	  driver.findElement(By.xpath("//div[@class='dropdown-content']/a[1]")).click();
	}

	@And("I click SELENIUM WITH PYTHON")
	public void i_click_selenium_with_python() throws InterruptedException {
	   System.out.println("I clic on Selenium with python");
	   Thread.sleep(8000);
       WebElement seleniumtab1=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab1).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[2]")).click();
	}

	@And("I click SELENIUM WITH TESTING")
	public void i_click_selenium_with_testing() throws InterruptedException {
	   System.out.println("I click on selenium with testing");
	   Thread.sleep(8000);
       WebElement seleniumtab2=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab2).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[3]")).click();
	}

	@And("I click SELENIUM IDE TUTORIAL")
	public void i_click_selenium_ide_tutorial() throws InterruptedException {
	   System.out.println("I click on selenium ide tutorial");
	   Thread.sleep(8000);
       WebElement seleniumtab3=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab3).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[4]")).click();
	}

	@And("I click \\{int}+ Most Important Selenium WebDriver Commands Tutorial")
	public void i_click_most_important_selenium_web_driver_commands_tutorial() throws InterruptedException {
	  System.out.println("I clci on most");
	  Thread.sleep(8000);
      WebElement seleniumtab4=driver.findElement(By.className("dropbtn"));
      act.moveToElement(seleniumtab4).perform();
      driver.findElement(By.xpath("//div[@class='dropdown-content']/a[5]")).click();
	}

	@And("I click \\{int}+ Most Important Selenium WebDriver Interview Questions and Answers")
	public void i_click_most_important_selenium_web_driver_interview_questions_and_answers() throws InterruptedException {
	   System.out.println("i click on most inter");
	   Thread.sleep(8000);
       WebElement seleniumtab5=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab5).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[6]")).click();
	}

	@And("I click SELENIUM BLOGS")
	public void i_click_selenium_blogs() throws InterruptedException {
	   System.out.println("i click on selenium blogs");
	   Thread.sleep(8000);
       WebElement seleniumtab6=driver.findElement(By.className("dropbtn"));
       act.moveToElement(seleniumtab6).perform();
       driver.findElement(By.xpath("//div[@class='dropdown-content']/a[7]")).click();
	}

	@Then("I closed the browser")
	public void i_closed_the_browser() {
	    // Write code here that turns the phrase above into concrete actions
	  System.out.println("i close the browser");
	  driver.close();
	}

}
