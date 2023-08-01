package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Featchmultidata {

	public static void main() throws EncryptedDocumentException, IOException {
		String s = null;
		FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Entering_data");
		int r=sh.getLastRowNum();
		for(int i=0;i<=r;i++)
		{
		Row rn=sh.getRow(i);
		 s=rn.getCell(0).getStringCellValue();
		//System.out.println(s);
		 
		}
		
	
	
		

	}
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		main();
		System.out.println();
	}
}
