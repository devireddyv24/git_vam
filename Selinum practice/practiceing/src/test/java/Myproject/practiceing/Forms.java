package Myproject.practiceing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;


public class Forms extends Lunch_browser {
	public  void forms()
	{
		 d.get("http://www.uitestpractice.com/");
	        d.manage().window().maximize();
	        d.findElement(By.xpath("//a[text()='Form']")).click();
	        d.findElement(By.id("firstname")).sendKeys("vamshi",Keys.TAB,"Devireddy");
	    WebElement e1=d.findElement(By.xpath("//*[@name='optradio']/../../label[3]"));
	    e1.click();
	WebElement e2=d.findElement(By.xpath("//*[@value='dance']"));
	e2.click();
	d.findElement(By.xpath("//*[@value='dance']/../../label[3]")).click();
	d.findElement(By.xpath("//*[@value='dance']/../../label[4]")).click();
	WebElement e3=d.findElement(By.id("sel1"));
	e3.click();
	SoftAssert s5=new SoftAssert();
	s5.assertEquals("homepage","homepages2");
	Select s=new Select(e3);
	s.selectByVisibleText("Bahrain");
	d.findElement(By.id("datepicker")).click();
	WebElement e4=d.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	Select s1=new Select(e4);
	s1.selectByValue("2000");
	WebElement e5=d.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	Select s2=new Select(e5);
	s2.selectByValue("3");
	d.findElement(By.xpath("//*[text()='24']")).click();
	d.findElement(By.id("phonenumber")).sendKeys("7093778248",Keys.TAB,"vamshidhar",Keys.TAB,"devireddyv22@gmail.com",Keys.TAB,"My name is vamshi i am from amangal",Keys.TAB,"Vamshi@123",Keys.TAB,Keys.ENTER);

	 	
	}

}
