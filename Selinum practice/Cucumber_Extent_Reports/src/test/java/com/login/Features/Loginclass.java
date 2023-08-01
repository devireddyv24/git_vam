package com.login.Features;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginclass {
	
	@Given("Openapplication")
	public void openapplication() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Open the application");
	}

	@And("Login_application")
	public void login_application() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("login appliaction");
	}

	@When("Click on search button")
	public void click_on_search_button() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("testing when");
	}

	@And("Enter the data")
	public void enter_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Enter the data");
	}

	@Then("I validate product")
	public void i_validate_product() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Validate the data");
	}

	@And("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("write step2");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

}
