package com.Magento;

import org.openqa.selenium.WebElement;

public class Coman_methods {
public static void click(WebElement element) {
	element.click();
}
public static void sendkeysclass(WebElement element,String s) {
	element.sendKeys(s);
}
public static void cleartext(WebElement element) {
	element.clear();
}
}
