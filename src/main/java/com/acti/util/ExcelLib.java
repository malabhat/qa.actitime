package com.acti.util;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelLib {

	XSSFWorkbook wb;

	public ExcelLib() {
		try {
			File file = new File("./src/test/resources/testdata/actdata.xlsx");
			FileInputStream fis = new FileInputStream(file);
			wb = new XSSFWorkbook(fis);
		} catch (Exception e) {
			System.out.println("Unable to read data from Excel file" + e.getMessage());
		}
	}

	public int getRowCount(int sheetnum) {
		return wb.getSheetAt(sheetnum).getLastRowNum() + 1;
	}

	public String getCellData(int sheetnum, int row, int cell) {
		return wb.getSheetAt(sheetnum).getRow(row).getCell(cell).toString();

	}
}
