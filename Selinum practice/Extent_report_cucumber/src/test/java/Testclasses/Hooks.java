package Testclasses;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;

public class Hooks extends Browser {

public byte[] getByteScreenshot() throws IOException 
{
    File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    byte[] fileContent = FileUtils.readFileToByteArray(src);
    return fileContent;
}
@After
public void af(Scenario scenario) throws IOException, InterruptedException
{
    if(scenario.isFailed())
    {			System.out.println("Enhopes screenshot 1234");
        scenario.attach(getByteScreenshot(), "image/png", scenario.getName());
        scenario.log("vamshidharreddy");
    }
    driver.quit();
}

}
