package Myproject.practiceing;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.Desktop.Action;
import java.sql.Time;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Msoffice extends Lunch_browser {
	@Test
	public void test() throws InterruptedException {
		//d.manage().timeouts().implicitlyWait();
		d.get("https://www.enhops.com/");
		WebElement e=d.findElement(By.xpath("//a[text()='Services']"));
		Actions act=new Actions(d);
		act.moveToElement(e).perform();
		d.findElement(By.linkText("Product Engineering")).click();
		d.findElement(By.xpath("//img[@*='pro-arch-logo']")).click();
		Thread.sleep(3000);
		String mainid=d.getWindowHandle();
		Set<String> allid=d.getWindowHandles();
		for (String string : allid) {
			if(!mainid.equals(string)) {
				d.switchTo().window(string);
			}
			
		}
		WebElement e2=d.findElement(By.xpath("//a[text()='Resources']"));
		act.moveToElement(e2).perform();
		d.findElement(By.xpath("//a[text()='Events']")).click();
		d.switchTo().window(mainid);
		d.close();
		d.quit();
		
		
	}
	public static void main(String[] args) {
		Msoffice m=new Msoffice();
		m.chrome();
		try {
			m.test();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
