package com.file.verify;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws Exception {

//		File f = new File("F:/Data validtions/data.xlsx");
//		FileInputStream fis = new FileInputStream(f);
//		Workbook wb= WorkbookFactory.create(fis);
//		Sheet st=(Sheet) wb.getSheet("Sheet1");
//		Row r = ((org.apache.poi.ss.usermodel.Sheet) st).getRow(0);
//		Cell c = r.getCell(0);
//		String data=c.toString();
//	System.out.println(data);
		
		String data= GetData.fromExcel("F:/Data validtions/data.xlsx", "Sheet1", 4, 0);
	}

}
