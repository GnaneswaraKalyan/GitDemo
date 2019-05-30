package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InsertDataExcl {

	public static void main(String[] args) throws Exception {
		File f = new File("F:/Data validtions/data.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook wb= WorkbookFactory.create(fis);
		Sheet st= wb.getSheet("Sheet1");
		/*Row r = st.getRow(0);
		Cell c=r.getCell(0);
		c.setCellValue("Selenium");
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);*/

		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		WebElement googletext =driver.findElement(By.xpath("//span[@class='Q8LRLc']"));
		String text=googletext.getText();
		System.out.println(text);
		
		Row row=st.getRow(0);
		int i=0;
		Iterator<Cell> names=row.cellIterator();
		while(names.hasNext())
		{
			Cell cell=names.next();
			String str=cell.getStringCellValue();
			if(str.equalsIgnoreCase("Values"))
			{
				System.out.println(i);
				st.createRow(1).createCell(i).setCellValue(text);
			}
			else {
				System.out.println("not found");
			}
			i++;
		}
		
		
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);
		driver.close();
/*		
		String data=StoreData.intoExcel("F:/Data validtions/data.xlsx", "Sheet1", 0, 0, "Kalyan");
		System.out.println(data);
	*/			
	}

}
