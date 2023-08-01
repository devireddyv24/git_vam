package Testclasses;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Gallery {
	@Given("i want to lunch the gallery")
	public void i_want_to_lunch_the_gallery() {
	  System.out.println("genarating th given");
	}

	@When("i completed the validation")
	public void i_completed_the_validation() {
	  System.out.println("print the when");
	}

	@Then("i close the browser")
	public void i_close_the_browser() {
	  System.out.println("print the then"); 
	}
}
