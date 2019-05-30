package com.training.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LanchChrome {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","F:/Selenium files/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.google.com");
//	driver.get("https://www.google.com");
	System.out.println("Open Browser Successfully");
//	driver.close();
	driver.quit();
	System.out.println("Closed Browser Successfully");

	
	
		
	}
		}