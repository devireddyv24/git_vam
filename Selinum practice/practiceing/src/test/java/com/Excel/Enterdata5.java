package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Enterdata5 {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		Scanner sc=new Scanner(System.in);
		String s;
		FileInputStream fis=new FileInputStream("C:\\Users\\VamshidharReddyDevir\\Desktop\\Maven Project\\practiceing\\TestData\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		System.out.println("enter sheet name");
		Sheet sh=book.createSheet(s=sc.next());
		for(int i=0;i<=3;i++) {
			Row r=sh.createRow(i);
			for(int j=0;j<=3;j++) {
				System.out.println("Enter the data into cell");
				r.createCell(j).setCellValue(s=sc.next());
			}
		}
		FileOutputStream fos=new FileOutputStream("C:\\\\Users\\\\VamshidharReddyDevir\\\\Desktop\\\\Maven Project\\\\practiceing\\\\TestData\\\\Book3.xlsx");
		book.write(fos);
	}

}
