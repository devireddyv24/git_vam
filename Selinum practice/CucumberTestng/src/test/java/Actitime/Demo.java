package Actitime;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println(driver.getTitle());
		ActitimePage act=new ActitimePage(driver);
		act.getusername("admin");
		//act.getpassword("manager");
		
	//	System.out.println(driver.getPageSource());

	}

}
