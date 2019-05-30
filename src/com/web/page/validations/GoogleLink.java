package com.web.page.validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();

	Thread.sleep(3000);
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().forward();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
	Thread.sleep(3000);
	System.out.println(driver.getTitle());
	System.out.println(driver.getCurrentUrl());
	
	
	driver.close();
	
	
	
	}

}
