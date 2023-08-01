package way2automation;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drag_and_drop {

	public static void main(String[] args) throws InterruptedException, IOException {
		int i=0;
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/draggable.php#load_box");
		Screenshot sh=new Screenshot(driver);
		ExtentHtmlReporter ehtml=new ExtentHtmlReporter("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Reports\\alert1.html");
        ExtentReports report=new ExtentReports();
        report.attachReporter(ehtml);
        ExtentTest test=report.createTest("Trying alerts");
        try {
		driver.findElement(By.linkText("Alert")).click();
		test.pass("click on alert link");
        }
        catch (Exception e) {
			// TODO: handle exception
        	i++;
        	String s=sh.screenshot("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\alert"+i+".png");
        	test.fail("not able to click on alert link");
        	test.addScreenCaptureFromPath(s);
		}
        try {
		driver.switchTo().frame(0);
		test.pass("switched to frame 1");
        }
        catch (Exception e) {
        	i++;
			// TODO: handle exception
        	String s=sh.screenshot("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\alert"+i+".png");
        	test.fail("driver not able to switch to  frame");
        	test.addScreenCaptureFromPath(s);
        	
		}
        try {
        	driver.findElement(By.xpath("//*[text()='Click the button to display an alert box:']")).click();
            WebDriverWait wait=new  WebDriverWait(driver,5);
            wait.until(ExpectedConditions.alertIsPresent()).accept();
            driver.switchTo().defaultContent();
    driver.findElement(By.xpath("//*[text()='Input Alert']")).click();
    test.pass("handle alert popup1");
			
		} catch (Exception e) {
			i++;
			// TODO: handle exception
			String s=sh.screenshot("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\alert"+i+".png");
			test.fail("not able to handle alert popup1");
			test.addScreenCaptureFromPath(s);
		}
		try {
			
			driver.switchTo().frame(1);
			Thread.sleep(3000);
			WebElement e=driver.findElement(By.xpath("//*[text()='Click the button to display an alert box:']"));
			e.click();
			//WebElement e=driver.findElement(By.xpath("//*[text()='Click the button to display an alert box:']"));
			//driver.switchTo().frame(element);
			System.out.println(e.getText());
			e.click();
			Alert alt=driver.switchTo().alert();
			alt.sendKeys("vamshi");
			test.pass("handle alert popup2");
			
		} catch (Exception e) {
			i++;
			// TODO: handle exception
			String s=sh.screenshot("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\alert"+i+".png");
			test.fail("not able to handle alart popup2");
			System.out.println("failed");
			test.addScreenCaptureFromPath(s);
		}
		report.flush();


	}

}
