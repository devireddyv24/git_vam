package way2automation;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alertpopups {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/draggable.php#load_box");
		driver.findElement(By.linkText("Alert")).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[text()='Click the button to display an alert box:']")).click();
        WebDriverWait wait=new  WebDriverWait(driver,6);
        wait.until(ExpectedConditions.alertIsPresent()).accept();
        driver.switchTo().defaultContent();
driver.findElement(By.xpath("//*[text()='Input Alert']")).click();
driver.switchTo().frame(1);
driver.findElement(By.xpath("//*[text()='Click the button to demonstrate the Input box.']")).click();
Alert alt=driver.switchTo().alert();
alt.sendKeys("Vamshi");
Thread.sleep(3000);
alt.accept();
	}

}
