package com.facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebookpage {
	WebDriver driver;
	@FindBy(id = "email")
	public  WebElement mail;
	@FindBy(xpath ="//*[text()='Friends']")
	public WebElement friend;
	public Facebookpage(WebDriver d){
		driver=d;
		PageFactory.initElements(driver, this);
	}

}
