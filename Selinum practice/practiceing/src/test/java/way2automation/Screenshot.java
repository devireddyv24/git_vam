package way2automation;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Screenshot {
	public WebDriver driver;
	public String  screenshot(String file) {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File sorc=sh.getScreenshotAs(OutputType.FILE);
		File dest=new File(file);
		try {
			Files.copy(sorc, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return file;
	}
	Screenshot(WebDriver driver)
	{
		this.driver=driver;
	}

}
