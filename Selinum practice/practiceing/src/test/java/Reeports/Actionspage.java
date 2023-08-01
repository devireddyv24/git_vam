package Reeports;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actionspage {
public 	WebDriver d;
	@FindBy(linkText = "Actions")
	public static WebElement link;
	@FindBy(xpath = "//*[text()='Drag me to my target']")
	public static WebElement drag;
	@FindBy(xpath = "//*[text()='Drop here']")
	public static WebElement drop;
	@FindBy(xpath = "//*[text()='Click Me !']")
	public static WebElement alartpop;
	public Actionspage(WebDriver d) {
		this.d=d;
		PageFactory.initElements(d,this);
		
	}

}
