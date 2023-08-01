package com.Screenshot;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Browser.LunchBrowser;
import com.google.common.io.Files;

public class Screenshot extends LunchBrowser {
	public static void take_screenshot(String s,WebDriver driver) throws IOException {
		TakesScreenshot sh=(TakesScreenshot)driver;
		File sroce=sh.getScreenshotAs(OutputType.FILE);
		File destination=new File(s);
	Files.copy(sroce, destination);
	}

}
