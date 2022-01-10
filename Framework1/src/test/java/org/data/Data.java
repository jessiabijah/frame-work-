package org.data;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data {
public static void main(String[] args) throws IOException {
	//file location
	File f=new File("C:\\Users\\Admin\\eclipse-workspace\\Framework1\\ExcelSheet\\FrameWork1ExcelRead.xlsx");
	//to read a file
	FileInputStream fin=new FileInputStream(f);
	//to fetch a workbook
	Workbook b =new XSSFWorkbook(fin);
	//to fetch sheet
	Sheet sh=b.getSheet("Sheet1");
	//to fetch row
	Row r=sh.getRow(0);
	//to fetch cell
	Cell c=r.getCell(2);
	System.out.println(c);
}
}

