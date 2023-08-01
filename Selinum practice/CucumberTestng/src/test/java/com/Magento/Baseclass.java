package com.Magento;

import java.io.IOException;

import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import com.Magento.TTd.DataFeatch;

public class Baseclass {
	public static WebDriver driver;
@org.testng.annotations.BeforeClass
public void browser() throws IOException {
	driver=Browser.browser("Browser");
	driver.get(DataFeatch.data("url"));
}
@AfterClass
public void driver_close() {
	driver.close();
}
}
