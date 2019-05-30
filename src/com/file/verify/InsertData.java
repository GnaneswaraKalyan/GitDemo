 package com.file.verify;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class InsertData {

	public static void main(String[] args) throws Exception {
//		File f = new File("F:/Data validtions/data.properties");
//		FileInputStream fis = new FileInputStream(f);
//		Properties prop = new Properties();
//		prop.load(fis);
//		prop.put("address", "Bangalore");
//		FileOutputStream fos = new FileOutputStream(f);
//		prop.store(fos, "Update the address");
		
		StoreData.toProperties("F:/Data validtions/data.properties", "Job", "Software ENgineer", "Updated Job Details");
	
		StoreData.toProperties("F:/Data validtions/data.properties", "Name", "Kalyan Ram", "Updated Name Details");
	}
	

}
