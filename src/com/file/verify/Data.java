package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Data {

	public static void main(String[] args) {
		try {
		File f = new File("F:/data.xlsx");
	FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet st= wb.createSheet("Test Data_1");
		Row r = st.createRow(0);
		Cell c=r.createCell(0);
		c.setCellValue("Name");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
