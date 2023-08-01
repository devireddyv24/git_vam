package Testng_practice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import Myproject.practiceing.Lunch_browser;

public class Opentsting extends Lunch_browser {
	@BeforeClass
	public void openurl() {
		chrome();
		 d.get("http://www.uitestpractice.com/");
	        d.manage().window().maximize();
	}
	@BeforeMethod
	public void method() {
		
	}
	@AfterMethod
	public void oftermethod() {
		
	}
	@AfterClass
	public void close() {
		d.close();
	}

}
