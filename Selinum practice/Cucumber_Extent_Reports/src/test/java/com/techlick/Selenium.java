package com.techlick;

import io.cucumber.java.en.And;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver; import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
class Selenium{
//import io.github.bonigarcia.wdm.WebDriverManager; public class Selenium {
@Given("I launched a browser")
 public void i_launched_a_browser() {
System.out.println("I launched a browser");}
@And("I navigate to Techlistic")
public void i_navigate_to_techlistic() {
 System.out.println("I navigate to Techlistic");}
@When("I perform Mouse Hover action on SELENIUM Tab")
public void i_perform_mouse_hover_action_on_selenium_tab() {
 System.out.println("I perform Mouse Hover action on SELENIUM Tab"); }
@And("I click SELENIUM WITH JAVA")
public void i_click_selenium_with_java() {
 System.out.println("I click SELENIUM WITH JAVA");}
@And("I click SELENIUM WITH PYTHON")
public void i_click_selenium_with_python() {
System.out.println("I click SELENIUM WITH PYTHON");}
@And("I click SELENIUM WITH TESTING")
public void i_click_selenium_with_testing() {
 System.out.println("I click SELENIUM WITH TESTING");}
 @And("I click SELENIUM IDE TUTORIAL")
public void i_click_selenium_ide_tutorial() {
	 System.out.println("I click SELENIUM IDE TUTORIAL");}
 @And("I click {int}+ Most Important Selenium WebDriver Commands Tutorial")
public void i_click_most_important_selenium_web_driver_commands_tutorial(Integer int1) {
System.out.println("I click {int}+ Most Important Selenium WebDriver Commands Tutorial");
} @And("I click {int}+ Most Important Selenium WebDriver Interview Questions and Answers")
public void i_click_most_important_selenium_web_driver_interview_questions_and_answers(Integer int1) {
System.out.println("I click {int}+ Most Important Selenium WebDriver Interview Questions and Answers");
} @And("I click SELENIUM BLOGS")
public void i_click_selenium_blogs() {
 System.out.println("I click SELENIUM BLOGS"); }
@Then("I closed the browser")
public void close() {
	System.out.println("close the browser");
}
}

