package com.Actions;

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

public class Windowhandleswithfeaturefile {
	WebDriver d;
	String main;
	Set<String> all;
	ArrayList<String> wnds;
	
	@Given("lunh browser")
	public void lunh_browser() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
	   
	}

	@And("navigate to uitestpractice")
	public void navigate_to_uitestpractice() {
		d.get("http://www.uitestpractice.com/"); 
	}

	@When("Click on switchto function")
	public void click_on_switchto_function() {
		d.findElement(By.linkText("Switch to")).click();
	}

	@And("Click on open new window")
	public void click_on_open_new_window() {
		d.findElement(By.xpath("//*[text()='Opens in a new window']")).click();
	}

	@And("Find the number of windows present in the webpage")
	public void find_the_number_of_windows_present_in_the_webpage() {
		 main=d.getWindowHandle();
		 all=d.getWindowHandles();
		 wnds=new ArrayList<>(all);
	}

	@And("switch to new window tab")
	public void switch_to_new_window_tab() {
		d.switchTo().window(wnds.get(1));
	}

	@And("click on select function")
	public void click_on_select_function() {
		d.findElement(By.linkText("Select")).click();
	   
	}
	



}
