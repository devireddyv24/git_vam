package Practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static WebDriver driver;
@Test
	public static void main() throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("365 office login",Keys.ENTER);
		driver.findElement(By.name("vamshi")).click();
		driver.findElement(By.xpath("//*[text()='Microsoft 365: Login']")).click();
		

	}
@AfterClass
public void after() throws IOException {
	TakesScreenshot sh=(TakesScreenshot)driver;
	File src=sh.getScreenshotAs(OutputType.FILE);
	File drs=new File("D:\\MyFramewok\\TestNgreports\\Screenshots\\demo.png");
	Files.copy(src, drs);
}

}
