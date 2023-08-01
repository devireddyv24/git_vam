package com.youtub;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HtmlTale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		List<WebElement> e=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		for (WebElement col : e) {
			System.out.println(col.getText());
		}
		System.out.println("coloum size "+e.size());
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println("row size is "+row.size());
		
		  for (WebElement rows : row) { 
			  System.out.println(rows.getText()); 
			  }
		 

	}

	}
