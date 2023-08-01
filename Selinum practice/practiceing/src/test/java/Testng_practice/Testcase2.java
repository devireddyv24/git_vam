package Testng_practice;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
@Listeners(Myproject.Screenshot.Listner.class)
public class Testcase2 extends Opentsting {
	@Test
	public void Switchto() {
		d.findElement(By.xpath("//*[text()='Select']")).click();
		WebDriverWait wait=new WebDriverWait(d,6);
		wait.until(ExpectedConditions.elementToBeClickable(By.id("dropdownMenu1")));
		d.findElement(By.id("dropdownMenu1")).click();
		d.findElement(By.xpath("//*[@id='dropdownMenu1']/../ul//li[3]/a")).click();
		WebElement e6= d.findElement(By.id("countriesMultiple"));
		Select s3=new Select(e6);
		s3.selectByIndex(3);
		WebElement e7=d.findElement(By.xpath("//select[@id='countriesSingle']"));
		Select s4=new Select(e7);
		s4.selectByIndex(1);
		//d.findElement(By.id("vamshi")).click();
	}

}
