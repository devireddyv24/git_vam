package Testng_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import Myproject.practiceing.Lunch_browser;

public class Zymho extends Lunch_browser{
@Test
	public static void main() {
		// TODO Auto-generated method stub
		d.get("https://www.zimyo.work/");
		   d.findElement(By.xpath("//input[@placeholder='Email or Mobile number']")).
		    sendKeys("dvamshidhar@enhops.com",Keys.TAB,"Vamshi@123",Keys.ENTER);

	}
	/*
	 * public static void main(String[] args) { chrome(); main();
	 * System.out.println(d.getTitle()); }
	 */

}
