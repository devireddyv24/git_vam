package com.Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Featchdata {
public static Map<Integer,String> key=new HashMap<>();
public static Map<Integer,String> value=new HashMap<>();
public static Map<String,String> data=new HashMap<>();
public static FileInputStream fis;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void featchdata() throws EncryptedDocumentException, IOException {
		fis=new FileInputStream("C:\\\\Users\\\\VamshidharReddyDevir\\\\Desktop\\\\Maven Project\\\\practiceing\\\\TestData\\\\Book3.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		Sheet sh=book.getSheet("Entering_data");
		for (Row row : sh) {
			int i=row.getLastCellNum();
			for(int j=0;j<=i;j++) {
				if(j==0)
			key.put(row.getRowNum(),row.getCell(j).getStringCellValue());
				else
					value.put(row.getRowNum(),row.getCell(j).getStringCellValue());
				for (int k :value.keySet()) {
					//if(value.get(k)!="")
					//{
						data.put(key.get(k),value.get(k));
					//}
					
				}
					
			}
		}
		System.out.println(data);
	}
	

}
