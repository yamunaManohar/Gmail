package com.gmail.generics;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.formula.WorkbookDependentFormula;
import org.apache.poi.ss.usermodel.*;

public class ReadExcelData {

	public static String readExcelFile(String pathName,int rowNum, int colNum) 
	{
		String data= "";
		FileInputStream fs;
		try {
			fs = new FileInputStream(pathName);
			Workbook wb = WorkbookFactory.create(fs);
			data  = wb.getSheet("Sheet1").getRow(rowNum).getCell(colNum).toString();
			
			
						
		} catch (Exception e) {
			
		}
		return data;
	}
	//To get the Row Count
	public static int getRowCount(String pathName,String sheetName)
	{
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(pathName);
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			int rowCount = workbook.getSheet(sheetName).getLastRowNum();
			return rowCount;
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			return 0;
		} 
		
	}
	
	//To get the Cell Count
	
	public static int getCellCount(String pathName,String shetName, int rowNum)
	{
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream(pathName);
			Workbook workbook = WorkbookFactory.create(fileInputStream);
			int cellCount = workbook.getSheet(shetName).getRow(rowNum).getLastCellNum();
			return cellCount;
			
		} catch (Exception e) {
			return 0;
		}
		
	}
	
	
	
	


}
