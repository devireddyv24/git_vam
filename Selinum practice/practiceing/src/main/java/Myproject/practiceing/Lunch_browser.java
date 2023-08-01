package Myproject.practiceing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Lunch_browser {
	public static WebDriver d;
	public static void chrome() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
	d=new ChromeDriver(options);
	d.manage().window().maximize();
		
	}
	public static void main(String[] args) {
		Lunch_browser l=new Lunch_browser();
		l.chrome();
	}

}
