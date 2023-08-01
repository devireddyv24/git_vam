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

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Testing3 extends Opentsting {

	@Test(enabled = true)
	public void Action() throws InterruptedException {
		d.findElement(By.linkText("Actions")).click();
		d.findElement(By.xpath("//*[text()='Click Me !']")).click();
		Alert alt=d.switchTo().alert();
		alt.accept();
		WebElement e=d.findElement(By.xpath("//*[text()='Double Click Me !']"));
		Actions act=new Actions(d);
		act.doubleClick(e).perform();
		Thread.sleep(3000);
		Alert alt1=d.switchTo().alert();
		alt1.accept();
		WebElement drag=d.findElement(By.xpath("//*[text()='Drag me to my target']"));
		WebElement drop=d.findElement(By.xpath("//*[text()='Drop here']"));
		act.dragAndDrop(drag,drop).perform();
	}

}
