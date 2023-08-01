package Testclass;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.AssertJUnit;

import Actitime.ActitimePage;
import Actitime.TestCases.properties.ActitimeDatafeatch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Actitimeclass extends Baseclas {
	public ActitimePage act;
	@Given("I want to Navigate to actitime website")
	public void i_want_to_navigate_to_actitime_website() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(ActitimeDatafeatch.data("url"));
		act=new ActitimePage(driver);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("Verify the data accepted in username taxt box")
	public void verify_the_data_accepted_in_username_taxt_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		act.getusername(ActitimeDatafeatch.data("uname"));
		AssertJUnit.assertTrue(true);
	}

	@Then("Verify the data accepted in password taxt box")
	public void verify_the_data_accepted_in_password_taxt_box() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		//Verifying password text box is accept data
		act.password(ActitimeDatafeatch.data("psw"));
		AssertJUnit.assertTrue(true);
	}

	@When("user enter valid username and password click on Login btn")
	public void user_enter_valid_username_and_password_click_on_login_btn() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
		//enter valid user name
		
		act.getusername(ActitimeDatafeatch.data("uname"));
		
		//enter valid password
		
		act.password(ActitimeDatafeatch.data("psw"));

		//Click the login button
		
	act.getlogin_bt();
	}

	@Then("Verify the home page is open or not")
	public void verify_the_home_page_is_open_or_not() throws InterruptedException {
		//Verifying Logout button is available or not
		Thread.sleep(50000);
		AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
		System.out.println(act.Logout_btn.getText());
	}

	@When("user enter valid username and password and press Enter")
	public void user_enter_valid_username_and_password_and_press_enter() throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//enter valid user name
		
		act.getusername(ActitimeDatafeatch.data("uname"));
		
		//Enter valid password and Click on Enter button
		
		act.getpassword(ActitimeDatafeatch.data("psw"));
		Thread.sleep(5000);
		//Verifying Logout button is available
		AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
	}

	@When("user able to select check box")
	public void user_able_to_select_check_box() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//act.getKeep_me_login().isSelected();
		
		Thread.sleep(4000);
		
	}

	@Then("Verify the check box is selected or not")
	public void verify_the_check_box_is_selected_or_not() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
AssertJUnit.assertTrue(act.getKeep_me_login().isSelected());
		
		Thread.sleep(4000);
	}

	@Then("Verify the account is login or not")
	public void verify_the_account_is_login_or_not() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(50000);
		AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");
	}

	@Then("Verify the account loged automatically")
	public void verify_the_account_loged_automatically() throws IOException, InterruptedException {
		//enter valid username
		act.getusername(ActitimeDatafeatch.data("uname"));
		//enter valid password
		act.password(ActitimeDatafeatch.data("psw"));
		//click on keep me logged check box
		act.getKeep_me_login();
		//click  on login button
		act.getlogin_bt();
		//Click on logout button
		Thread.sleep(3000);
		act.getLogout();
		//click on login button
		act.getlogin_bt();
		Thread.sleep(5000);
		//Verifying logout link is available or not
		AssertJUnit.assertEquals(act.Logout_btn.getText(),"Logout");	}

	@Then("Verify the user should not login")
	public void verify_the_user_should_not_login() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			//verifying logout button is click or not
			act.getLogout();
			AssertJUnit.assertTrue(false);
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			AssertJUnit.assertTrue(true);
		}
	}

	@When("Check invaliddata {string} in username field")
	public void check_invaliddata_in_username_field(String string) throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//enter in valid user name
		act.getusername(string);
		
		//enter valid password
		
		act.password(ActitimeDatafeatch.data("psw"));
		Thread.sleep(5000);
		//click on check box
		act.getKeep_me_login();
		//click on login button
		act.getlogin_bt();
	}

	@Then("Verify user should not login")
	public void verify_user_should_not_login() {
	    // Write code here that turns the phrase above into concrete actions
		try {
			//verifying logout button is click or not
			act.getLogout();
			AssertJUnit.assertTrue(false);
		}
		catch (NoSuchElementException e) {
			// TODO: handle exception
			AssertJUnit.assertTrue(true);
		}
	}

	
	@When("Check invaliddata {string} in password field")
	public void check_invaliddata_in_password_field(String string) throws IOException, InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		//enter valid  user name
		System.out.println(string);
		act.getusername(ActitimeDatafeatch.data("uname"));
		//enter in valid password
		
		act.password(string);
		Thread.sleep(5000);
		//clcik on check box
		act.getKeep_me_login();
		//click on login button
		act.getlogin_bt();
	}

	

}
