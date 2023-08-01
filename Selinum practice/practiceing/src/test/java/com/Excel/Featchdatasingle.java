package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Featchdatasingle {
	public static String featch(String s,int i,int j) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		String data=book.getSheet(s).getRow(i).getCell(j).getStringCellValue();
		return data;
	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		//String s=featch("Entering_data",1,3);
		
		//System.out.println(s);
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("http://www.uitestpractice.com/");
        d.manage().window().maximize();
        d.findElement(By.xpath("//a[text()='Form']")).click();
        d.findElement(By.id("firstname")).sendKeys(featch("Entering_data",1,3));
	}

}
