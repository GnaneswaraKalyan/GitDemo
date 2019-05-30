package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class StoreData {
	private static final String SheetName = null;
	private static final String String = null;

	public static void toProperties(String filepath,String key,String value, String CommentMsg) {
		try {
			File f=new File(filepath);
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			prop.put(key, value);
			prop.put(key, value);
			FileOutputStream fos = new FileOutputStream(f);
			prop.store(fos, CommentMsg);			
		} catch (Exception e) {
			e.printStackTrace();
			}
	}
	public static String intoExcel(String filepath,String SheetName,int rowIndex,int cellIndex,String data) {
		try {
			File f=new File(filepath);
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet st=wb.getSheet(SheetName);
			Row r = st.getRow(rowIndex);
			Cell c=r.getCell(cellIndex);
			c.setCellValue(data);
			FileOutputStream fos=new FileOutputStream(f);
			wb.write(fos);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}


}
