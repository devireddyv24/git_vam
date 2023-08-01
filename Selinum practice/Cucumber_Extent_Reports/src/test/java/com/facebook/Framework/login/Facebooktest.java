package com.facebook.Framework.login;

import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.Keys;

import com.Browser.LunchBrowser;
import com.Properticefile.Featchdata;
import com.Screenshot.Screenshot;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.facebook.Facebookpage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Facebooktest extends LunchBrowser {
	//ExtentHtmlReporter exhtml;
	ExtentReports reports;
	ExtentTest test;
	@Given("Lunch the browser")
	public void lunch_the_browser() {
		//exhtml=new ExtentHtmlReporter("D:\\MyFramewok\\mynewframe\\Reports\\fac.html");
		 reports=new ExtentReports();
		//reports.attachReporter(exhtml);
	 test=reports.createTest("login","In facebook");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter browser name");
		String s=sc.next();
		LunchBrowser.browser(s);
	}

	@And("Enter url")
	public void enter_url() {
		driver.get(Featchdata.data("url"));
		test.pass("Open application");
	}

	@When("Login facebook")
	public void login_facebook() {
		Facebookpage login=new Facebookpage(driver);
		login.mail.sendKeys(Featchdata.data("email"),Keys.TAB,Featchdata.data("password"),Keys.ENTER);
		test.pass("Enter the login details");
	}

	@And("Click on friends")
	public void click_on_friends() throws IOException {
		Screenshot.take_screenshot("D:\\MyFramewok\\mynewframe\\Takescrennshots\\facebook1.png",driver);
		Facebookpage login=new Facebookpage(driver);
		try {
		login.friend.click();
		test.pass("Click on frinds");
		}
		catch (Exception e) {
			test.fail("no such element");
			test.addScreenCaptureFromPath("D:\\MyFramewok\\mynewframe\\Takescrennshots\\facebook1.png");
		}
		
	}

	@Then("Close the application")
	public void close_the_application() {
		driver.close();
	  test.pass("close application successfully");
	}

	@And("Close the browser")
	public void close_the_browser() {
		driver.quit();
		test.pass("Close browser successfully");
		reports.flush();
	   
	}


}
