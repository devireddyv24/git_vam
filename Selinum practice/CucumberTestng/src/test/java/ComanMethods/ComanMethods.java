package ComanMethods;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ComanMethods {
	
	
	
	public void Sent_txt_box(WebElement element,String data) {
		element.clear();
		element.sendKeys(data);
		
	}
	public void Clear_text(WebElement element) {
		element.clear();
	}
	public void Click_function(WebElement element) {
		element.click();
	}
	public void Enter_with_Sendkeys(WebElement element,String s) {
		element.sendKeys(s,Keys.ENTER);
	}
	

}
