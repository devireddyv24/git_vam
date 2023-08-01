package Testclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Enhops extends Baseclas {

@Given("I want to navigate google url")
public void i_want_to_navigate_google_url() {
   driver.get("https://www.google.com/");
}

@When("I want to search enhops in search box")
public void i_want_to_search_enhops_in_search_box() {
   driver.findElement(By.name("q")).sendKeys("Enhops",Keys.ENTER);
   driver.findElement(By.xpath("//h3[@class='LC20lb MBeuO DKV0Md']")).click();
}

@Then("I validate the Enhops page is open")
public void i_validate_the_enhops_page_is_open() {
  String title=driver.getTitle();
  Assert.assertEquals(title,"Ehops Homepage");
}
}
