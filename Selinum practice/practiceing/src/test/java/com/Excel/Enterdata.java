package com.Excel;

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

public class Enterdata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
	Workbook book=WorkbookFactory.create(fis);
book.createSheet("vams").createRow(1).createCell(0).setCellValue("vamshi");
FileOutputStream fis1=new FileOutputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
book.write(fis1);
	}

}
