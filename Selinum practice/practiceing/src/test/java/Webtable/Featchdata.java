package Webtable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Featchdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		ChromeOptions opt=new ChromeOptions();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.techlistic.com/p/demo-selenium-practice.html#:~:text=Practice%20Exercise%20with%20Solution%20Code%20-%20How%20to,the%20tallest%20structure%20in%20the%20table%20with%20Selenium");
List<WebElement> hed=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/th"));

List<WebElement>all=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
List<WebElement> data=driver.findElements(By.xpath("//*[@id='customers']/tbody/tr/td"));
FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
Workbook book=WorkbookFactory.create(fis);
Sheet sh=book.createSheet("webtable data");
Row r=sh.createRow(0);
for(int i=0;i<hed.size();i++) {
	String s=hed.get(i).getText();
	Cell ce=r.createCell(i);
	ce.setCellValue(s);
	
	  FileOutputStream fos=new
	  FileOutputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx"
	  ); book.write(fos);
	
}


int k=-1;
for(int i=1;i<all.size();i++) {
	r=sh.createRow(i);
	for(int j=0;j<hed.size();j++) {
		k++;
		String datas=(data.get(k).getText());
		//r=sh.createRow(i);
		Cell ce=r.createCell(j);
		System.out.println(datas);
		ce.setCellValue(datas);
		
		  FileOutputStream fos=new
		  FileOutputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx"
		  ); book.write(fos);
		 
		
	}
	FileOutputStream fos=new FileOutputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
	book.write(fos);
}


}
}

