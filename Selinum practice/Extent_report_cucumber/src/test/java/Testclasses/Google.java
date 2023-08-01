package Testclasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Google {
	WebDriver driver;
	@Given("I want to lunch the browser")
	public void i_want_to_lunch_the_browser() {
	
	 driver=Browser.broser();
	}

	@When("I want to search for  ehops")
	public void i_want_to_search_for_ehops() {
	  driver.get("https://codingbat.com/java");
	  driver.findElement(By.xpath("//input[@name='uname']")).sendKeys("devireddyv22@gmail.com");
	  driver.findElement(By.name("vamshi"));
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
	  driver.close();
	}

}
