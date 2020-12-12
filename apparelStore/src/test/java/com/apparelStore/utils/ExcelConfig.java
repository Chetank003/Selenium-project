package com.apparelStore.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Hashtable;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelConfig {

	public static Object[][] readFromExcel(String filePath, String sheetName) throws IOException {
		File file = new File(filePath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook book = new XSSFWorkbook(inputStream);
		Sheet sheet = book.getSheet(sheetName);
		
		int rowCount = sheet.getLastRowNum();
		Row headerRow = sheet.getRow(0);
		Object[][] data = new Object[rowCount][1];
		
		for (int i = 1; i <= rowCount; i++) {
			Hashtable<String, String> dataVal = new Hashtable<String, String>();
			Row row = sheet.getRow(i);
			for (int j = 0; j < row.getLastCellNum(); j++) {
				dataVal.put(headerRow.getCell(j).getStringCellValue(), row.getCell(j).getStringCellValue());
			}
			data[i-1][0] = dataVal;
		}
		
		book.close();
		inputStream.close();
		return data;
	}
}
