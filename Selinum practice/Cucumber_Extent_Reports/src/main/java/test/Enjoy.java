package test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Enjoy {
	@Given("i want to genarate the report")
	public void i_want_to_genarate_the_report() {
	   System.out.println("given running");
	}

	@When("I complete extent report")
	public void i_complete_extent_report() {
	   System.out.println("when is running");
	}

	@Then("I close the browser")
	public void i_close_the_browser() {
	  System.out.println("then is running");
	}
}
