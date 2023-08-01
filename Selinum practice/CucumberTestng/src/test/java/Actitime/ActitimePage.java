package Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import ComanMethods.ComanMethods;

public class ActitimePage extends ComanMethods {
public static WebDriver driver;
	public ActitimePage(WebDriver driver) {
		super();
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="username")
	public WebElement username;
	@FindBy(name = "pwd")
	public WebElement password;
	
	@FindBy(xpath = "//*[text()='Logout']")
	public WebElement Logout_btn;
	@FindBy(xpath = "//*[text()='Login ']")
	public WebElement login_bt;
	@FindBy(name = "remember")
	public WebElement keep_me_logged_chkbox;
	
	public WebElement getusername(String s) {
		Sent_txt_box(username, s);
		return username;
		
	}
	public void password(String s) {
		Sent_txt_box(password, s);
	}
	public WebElement getpassword(String s) {
		Enter_with_Sendkeys(password, s);
		return password;
	}
	public WebElement getLogout() {
		Click_function(Logout_btn);
		return Logout_btn;
		
	}
	public WebElement getlogin_bt() {
		Click_function(login_bt);
		return login_bt;
	}
	public WebElement getKeep_me_login() {
		Click_function(keep_me_logged_chkbox);
		return keep_me_logged_chkbox;
		
	}
	public void Login_functionality(String username,String password) throws InterruptedException {
		getusername(username);
		password(password);
		Click_function(login_bt);
		Thread.sleep(3000);
		Click_function(Logout_btn);
		
	}

}
