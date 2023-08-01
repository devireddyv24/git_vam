package flifcart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	public WebDriver driver;
	@BeforeClass
	public void  openapp(){
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/?ef_id=d0fbd88fea551b2c6883bb5eef0db10f:G:s&s_kwcid=AL!739!10!76484920232329!76485137405439&semcmpid=sem_F1167BY7_Brand_adcenter");
		driver.findElement(By.xpath("//*[text()='✕']")).click();
	}
	@BeforeMethod
	public void enterurl() {
		System.out.println("start");
		
	}
	@AfterMethod
	public void back() {
		
		driver.navigate().back();
	}
	@AfterClass
	public void close() {
		driver.quit();
		
	}
	

}
