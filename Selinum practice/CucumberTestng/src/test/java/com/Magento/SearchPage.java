package com.Magento;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	public static WebDriver driver;
@FindBy(name = "q")
private WebElement searchtextbox;

@FindBy(xpath = "//*[@title='Search']")
private WebElement Search_symbol;

public SearchPage(WebDriver driver){
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getSearchtextbox(String s) {
	Coman_methods.sendkeysclass(searchtextbox,s);
	//searchtextbox.sendKeys(productname);
	return searchtextbox;
}

public boolean getSearch_symbol() {
boolean b=Search_symbol.isDisplayed();
	
	return b;
}
public void copeytext() throws InterruptedException {
	searchtextbox.sendKeys(Keys.CONTROL,"A");
	Thread.sleep(3000);
	searchtextbox.sendKeys(Keys.CONTROL,"c",Keys.BACK_SPACE);
	Thread.sleep(3000);
	searchtextbox.sendKeys(Keys.CONTROL,"v");
}
public void cleartextinTextbox() {
	Coman_methods.cleartext(searchtextbox);
}
public void Click_on_Searchsymbol() {
	Coman_methods.click(Search_symbol);
}







}
