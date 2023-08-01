package Myproject.practiceing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import Myproject.practiceing.Lunch_browser;

public class Zymholog extends Lunch_browser {
	@Test
	public void test() {
		d.get("https://www.zimyo.work/");
		//System.out.println(d.getTitle());
		//d.findElement(By.xpath("//*[text()='Login']")).click();
		d.findElement(By.xpath("//*[@*='Email or Mobile number']")).sendKeys("dvamshidhar@enhops.com",Keys.TAB,"Vamshi@123",Keys.ENTER);
		
	}
	public static void main(String[] args) {
		Zymholog lo=new Zymholog();
		lo.chrome();
		lo.test();
		System.out.println(d.getTitle());
		
	}

}
