package com.actitime;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tasks {
public static void main(String[] args) throws InterruptedException {
	
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-dev-shm-usage");
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver(opt);
	
	driver.get("https://demo.actitime.com/login.do");
	driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
	driver.findElement(By.id("username")).sendKeys(" admin",Keys.TAB,"manager",Keys.ENTER);
	/*
	 * driver.findElement(By.id("container_tasks")).click();
	 * driver.findElement(By.className("collapseButton")).click();
	 */
	/*
	 * driver.findElement(By.id("container_tt")).click();
	 * driver.findElement(By.className("switcherBackground")).click();
	 * driver.findElement(By.id("SubmitTTButton")).click();
	 * driver.findElement(By.xpath(
	 * "//*[@id=\"topnav\"]/tbody/tr[1]/td[7]/table/tbody/tr/td/div/table/tbody/tr[2]/td/div/div[2]/div/div[1]/div"
	 * )).click();
	 * driver.findElement(By.xpath("//*[text()='Notifications']")).click();
	 * driver.findElement(By.xpath("//*[text()='Send Notifications Now']")).click();
	 */
  driver.findElement(By.id("container_users")).click();
  driver.findElement(By.xpath("//*[text()='Bulk Invitations']")).click();
  Thread.sleep(8000);
  Set<String> all=driver.getWindowHandles();
  System.out.println(all);
  driver.findElement(By.xpath("//tr[@class='firstRow ']/td[2]")).sendKeys("madhu",Keys.TAB,"sri",Keys.TAB,"sri@2123");
 // driver.findElement(By.xpath("//tr[@class='firstRow ']/td[2]")).sendKeys("madhu",Keys.TAB,"sri",Keys.TAB,"sri@2123",Keys.TAB,"mad",Keys.TAB,"sries",Keys.TAB,"mad@123",Keys.TAB,"mahu",Keys.TAB,"sai",Keys.TAB,"sai@2123");
	/*
	 * driver.findElement(By.xpath("//*[text()='New User']")).click();
	 * Thread.sleep(3000);
	 */
	/*
	 * driver.findElement(By.xpath("//input[@id='createUserPanel_firstNameField']"))
	 * .sendKeys("madhu",Keys.TAB,"sri",Keys.TAB,"c",Keys.TAB,"madhu@123");
	 * driver.findElement(By.
	 * xpath("//div[@class='simpleListMenuButton components_userGroupSelectorMenu emptyList notEmpty']"
	 * )).click();
	 * driver.findElement(By.xpath("//*[text()='-- new department --']/../div[3]")).
	 * click();
	 * driver.findElement(By.xpath("//*[text()='Save & Send Invitation']")).click();
	 * Thread.sleep(3000);
	 */
driver.findElement(By.className("closeLink")).click();
}
}
