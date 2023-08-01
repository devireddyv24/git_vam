package Webtable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelshetdata {

	public static void main(int i,int j,String data) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Sheet1");
		Row r=sh.createRow(j);
		Cell ce=r.createCell(i);
		ce.setCellValue(data);
		FileOutputStream fos=new FileOutputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		book.write(fos);

	}

}
