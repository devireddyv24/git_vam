package Webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewWebtable {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
        List<WebElement> hed=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
        for (WebElement col :hed) {
            System.out.println(col.getText());
        }
        System.out.println("coloum size "+hed.size());
        List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
        List<WebElement> dat=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
        System.out.println("row size is "+row.size());

          for (WebElement rows : row) { 
              System.out.println(rows.getText()); 
              }
          
          
          FileInputStream fis=new FileInputStream(".//TestData//Webtable.xlsx");
          Workbook book=WorkbookFactory.create(fis);
          Sheet sh=book.createSheet("Top Gainers");
          Row r=sh.createRow(0);
          for(int i=0;i<hed.size();i++) {
          	String s=hed.get(i).getText();
          	Cell ce=r.createCell(i);
          	ce.setCellValue(s);
          	
          	  FileOutputStream fos=new
          	  FileOutputStream(".//TestData//Webtable.xlsx" );
          	  book.write(fos);
          	
          }


          int k=-1;
          for(int i=1;i<row.size();i++) {
          	r=sh.createRow(i);
          	for(int j=0;j<hed.size();j++) {
          		k++;
          		String datas=(dat.get(k).getText());
          		//r=sh.createRow(i);
          		Cell ce=r.createCell(j);
          		System.out.println(datas);
          		ce.setCellValue(datas);
          		
          		  FileOutputStream fos=new
          		  FileOutputStream(".//TestData//Webtable.xlsx"
          		  ); book.write(fos);
          		 
          		
          	}
          	FileOutputStream fos=new FileOutputStream(".//TestData//Webtable.xlsx");
          	book.write(fos);


 

    }
	}}


