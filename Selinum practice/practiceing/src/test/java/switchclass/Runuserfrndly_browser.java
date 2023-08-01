package switchclass;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Runuserfrndly_browser {

	public static void main(String[] args) {
		WebDriver d=null;
	     Scanner s=new Scanner(System.in);
	     System.out.println("Enter the browser name");
	     String browser=s.nextLine();
	     switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			d=new ChromeDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			d=new EdgeDriver();
	      break;
		default:
			System.out.println("enter reqired browser name");
		}
	     d.get("https://enhops.com/");
	     d.manage().window().maximize();
	     WebElement s1=d.findElement(By.xpath("//*[text()='Services']"));
	     Actions act=new Actions(d);
	     act.moveToElement(s1).perform();
	     WebElement s2=d.findElement(By.xpath("//*[text()='Quality Engineering']"));
	     act.moveToElement(s2).perform();
	     WebElement s3=d.findElement(By.xpath("//*[text()='Quality Engineering Strategy']"));
	     s3.click();
	    
	 
		}

	}


