package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.WorkbookUtil;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Cell {
	public static void main(String[] args) throws IOException {
		
	
//file location
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Framework1\\ExcelSheet\\empWorkBook.xlsx"); 
	//to read a file
	FileInputStream fin=new FileInputStream(f);
	//to getWorkBook
	Workbook b=new XSSFWorkbook(fin);
	//To fetch a sheet
	Sheet sh=b.getSheetAt(0);
	//to fetch a row
	
}
}
