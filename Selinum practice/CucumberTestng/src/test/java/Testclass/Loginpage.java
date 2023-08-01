package Testclass;

import org.openqa.selenium.By;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginpage extends Baseclas {
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    
	}

	@When("User enters username as {string}")
	public void user_enters_username_as(String userName) {
	  
		System.out.println("Username entered");
		driver.findElement(By.name("txtUsername")).sendKeys(userName);
	}

	@When("User enters password as {string}")
	public void user_enters_password_as(String password) {
	  System.out.println("Password entered");
	  driver.findElement(By.name("txtPassword")).sendKeys(password);
	  
	  driver.findElement(By.id("btnLogin")).submit();
	}

	@Then("User should be able to login successfully")
	public void user_should_be_able_to_login_successfully() {
		String newPageText = driver.findElement(By.id("welcome")).getText();
        System.out.println("newPageText =" + newPageText);
	}
}
