package way2automation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Resize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.way2automation.com/way2auto_jquery/resizable.php#load_box");
		driver.switchTo().frame(0);
		WebElement drog=driver.findElement(By.xpath("//*[@*='ui-resizable-handle ui-resizable-e']"));
		Actions act=new Actions(driver);
		act.dragAndDropBy(drog, 300,0).perform();
		WebElement drogdown=driver.findElement(By.xpath("//*[@class='ui-resizable-handle ui-resizable-s']"));
		act.dragAndDropBy(drogdown, 300, 100).perform();
		driver.switchTo().defaultContent();
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,document.body.scrollHeight);");

	}

}
