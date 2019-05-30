package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

import javax.xml.crypto.Data;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

	public static String fromProperties(String filepath,String key) {
		String data = null;
		try {
			File f=new File(filepath);
			FileInputStream fis=new FileInputStream(f);
			Properties prop=new Properties();
			prop.load(fis);
			data = prop.get(key).toString();
			System.out.println(data);
		} catch (Exception e) {
			e.printStackTrace();
		}
	
		return data;
		
	}
	public static String fromExcel(String filepath,String sheetname,int rowIndex,int cellIndex) throws Exception {
		
		try {
	
		File f=new File(filepath);
		FileInputStream fis =new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetname);
		Row r =st.getRow(rowIndex);
		Cell c= r.getCell(cellIndex);
		String data = c.toString();
		System.out.println(data);
		}
		catch (Exception e) {
					e.printStackTrace();
		}
		String data = null;
		return data;
		
				
	}
	
}
