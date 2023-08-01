package com.enhopestest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enhopspage {
	WebDriver d;
	@FindBy(xpath = "//*[text()='Resources']")
	public WebElement res;
	@FindBy(xpath = "//*[text()='Blog']")
	public WebElement blog;
	@FindBy(xpath = "//*[@*='tpg-post-link']")
	public WebElement link;

	public Enhopspage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
	}
	

}
