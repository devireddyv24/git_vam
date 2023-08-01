package Windowpopup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Handles {
	WebDriver d;
	@Given("I want to lunch browser")
	public void i_want_to_lunch_browser() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		System.out.println("Lunch the browser");
	}

	@And("I wwant to open application")
	public void i_wwant_to_open_application() {
	    // Write code here that turns the phrase above into concrete actions
		d.get("http://www.uitestpractice.com/");
		d.findElement(By.linkText("Switch to")).click();
		System.out.println("Click on switch to link");
	}

	@When("I perform task")
	public void i_perform_task() {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.xpath("//*[text()='Opens in a new window']")).click();	
		System.out.println("Click on new window link");
	}

	@And("perform some actions")
	public void perform_some_actions() {
	    // Write code here that turns the phrase above into concrete actions
		String main=d.getWindowHandle();
		Set<String> all=d.getWindowHandles();
		ArrayList<String> wnds=new ArrayList<>(all);
		d.switchTo().window(wnds.get(1));
		d.findElement(By.linkText("Select")).click();
		System.out.println("driver switch to child window");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		d.close();
		d.quit();
		System.out.println("close the browser");
	}

}
