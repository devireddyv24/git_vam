package Testclass;



import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;

import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends Baseclas {

	@Before
	public void setupDriver() throws InterruptedException {
		

		WebDriverManager.edgedriver().setup();

		driver = new EdgeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@After
	public void quit(Scenario s) throws Exception {
         if(s.isFailed()) {
        	 TakesScreenshot sh=(TakesScreenshot)driver;
        	 File src=sh.getScreenshotAs(OutputType.FILE);
        	 File drs=new File("D:\\MyFramewok\\TestNgreports\\Screenshots\\"+s.getName()+".png");
        	 Files.copy(src, drs);
        	 String img="<img src='D:\\MyFramewok\\TestNgreports\\Screenshots\\"+s.getName()+".png'>"+s.getId()+"</img>";
        	 Reporter.log(img);
         }
		driver.quit();
	}

}
