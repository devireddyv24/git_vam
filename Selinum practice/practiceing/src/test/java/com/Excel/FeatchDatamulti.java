package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FeatchDatamulti {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Enhops");
		int  i=sh.getLastRowNum();
		//System.out.println(i);
		for(int j=0;j<=i;j++) {
			Row r=sh.getRow(j);
			int cenum=r.getLastCellNum();
			//System.out.println(cenum);
			for(int k=0;k<cenum;k++) {
				Cell c=r.getCell(k);
				System.out.print(c.getStringCellValue()+" | ");
			}
			System.out.println();
		}

	}

}
