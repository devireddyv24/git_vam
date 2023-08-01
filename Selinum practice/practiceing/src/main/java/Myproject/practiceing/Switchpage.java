package Myproject.practiceing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Switchpage {
	public static WebDriver d=Switchclass.d;
	public static WebElement select=d.findElement(By.linkText("Select"));
public static WebElement country;
public static void test() {
	country=d.findElement(By.id("countriesSingle"));
}
}
