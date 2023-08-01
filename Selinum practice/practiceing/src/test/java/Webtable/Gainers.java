package Webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
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
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Gainers {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> hed=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        List<WebElement> dat=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
        
        FileInputStream fis=new FileInputStream(".//TestData//Geniric.xlsx");
        Workbook book=WorkbookFactory.create(fis);
        Sheet sh=book.createSheet("webtable data2");
        Row r;
        for(int i=0;i<hed.size();i++) {
        	String value=hed.get(i).getText();
        	sh.createRow(0).createCell(i).setCellValue(value);
        	FileOutputStream fos=new FileOutputStream(".//TestData//Geniric.xlsx");
        	book.write(fos);
        	 int k=-1;
            if(i>0) {
             	r=sh.createRow(i);
             	for(int j=0;j<hed.size();j++) {
             		k++;
             		String datas=(dat.get(k).getText());
             		//r=sh.createRow(i);
             		Cell ce=r.createCell(j);
             		System.out.println(datas);
             		ce.setCellValue(datas);
             		
             		  FileOutputStream fos1=new
             		  FileOutputStream(".//TestData//Geniric.xlsx"
             		  ); book.write(fos);
             		 
             		
             	}
             	FileOutputStream fos1=new FileOutputStream(".//TestData//Geniric.xlsx");
             	book.write(fos);
        }
	}
	}
}


