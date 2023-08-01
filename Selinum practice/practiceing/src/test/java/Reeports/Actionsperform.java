package Reeports;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.google.common.io.Files;
import com.reportsmainclass.Extentreportgen;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionsperform extends Extentreportgen {
public static WebDriver d;
	public static void main(String[] args) throws IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriverManager.chromedriver().setup();
	d=new ChromeDriver(options);
	d.manage().window().maximize();

	
	ExtentHtmlReporter report=new ExtentHtmlReporter("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Reports\\re23.html");
ExtentReports rep=new ExtentReports();
	rep.attachReporter(report);
	ExtentTest test=rep.createTest("Actions","Drogedby");
	//reports();
	d.get("http://www.uitestpractice.com/");
	TakesScreenshot sh=(TakesScreenshot)d;
	File src=sh.getScreenshotAs(OutputType.FILE);
	File drs=new File("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\Screenshots\\she3.png");
    try {
		Files.copy(src, drs);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	Actionspage acte=new Actionspage(d);
	acte.link.click();
	test.pass("Clicked on actions link");
	Actions act=new Actions(d);
	act.dragAndDrop(acte.drag,acte.drop).perform();
	acte.alartpop.click();
	test.pass("drog and drop perform by using Actions class");

	Alert at=d.switchTo().alert();
	at.sendKeys("vamshi");
	
	test.addScreencastFromPath("C:\\\\Users\\\\VamshidharReddyDevir\\\\Desktop\\\\Maven Project\\\\practiceing\\\\Screenshots\\\\she3.png");
	test.fail("Alert popup failed");
	
	
	rep.flush();

	}

}
