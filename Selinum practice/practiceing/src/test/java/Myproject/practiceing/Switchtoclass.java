package Myproject.practiceing;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
public class Switchtoclass extends Lunch_browser {
	public void switchmethod() {
		 d.get("http://www.uitestpractice.com/");
		 d.findElement(By.linkText("Switch to")).click();
		 d.findElement(By.id("prompt")).click();
		 Alert act=d.switchTo().alert();
		 System.out.println(act.getText());
		act.sendKeys("vamshi");
		act.accept();
		d.close();
		
	}
	public static void main(String [] args) {
		Switchtoclass s=new Switchtoclass();
		s.chrome();
		s.switchmethod();
		Forms forms = new Forms();
		forms.chrome();
		forms.forms();
		
		
	}

}
