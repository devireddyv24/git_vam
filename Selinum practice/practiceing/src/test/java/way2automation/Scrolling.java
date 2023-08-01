package way2automation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.uitestpractice.com/");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		WebElement doupleclick=driver.findElement(By.name("dblClick"));
		act.doubleClick(doupleclick).perform();
		Alert alt=driver.switchTo().alert();
		alt.accept();
		JavascriptExecutor jsc=(JavascriptExecutor)driver;
		jsc.executeScript("window.scrollBy(0,document.body.scrollHeight);");

	}

}
