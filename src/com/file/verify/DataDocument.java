package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class DataDocument {

	public static void main(String[] args) throws Exception {
//		File f = new File("F:/Data validtions/data.properties");
//		FileInputStream fis = new FileInputStream(f);
//		Properties prop = new Properties();
//		prop.load(fis);
//		String data=prop.get("Name").toString();
//		System.out.println(data);
		
		String data = GetData.fromProperties("F:/Data validtions/data.properties","Name");

	}

}
