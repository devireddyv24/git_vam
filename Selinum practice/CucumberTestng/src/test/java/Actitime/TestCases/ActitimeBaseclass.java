package Actitime.TestCases;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import Actitime.ActitimePage;
import Actitime.TestCases.properties.ActitimeDatafeatch;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeBaseclass {
	public static WebDriver driver;
	ActitimePage act;
@BeforeMethod
public void browserLunch() throws IOException {
	WebDriverManager.chromedriver().setup();
	driver=new ChromeDriver();
	driver.get(ActitimeDatafeatch.data("url"));
	act=new ActitimePage(driver);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
}
@AfterMethod
public void close_the_browser() {
	driver.close();
}
@DataProvider(name="ActitimeInvaliddata")
public Object[] dataprovider() {
	Object[] data= {"123456","abcdef","!@#$%^&*"};
	return data;
	
}
}
