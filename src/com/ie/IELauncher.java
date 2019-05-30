package com.ie;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELauncher {

	public static void main(String[] args) {
	System.setProperty("webdriver.ie.driver", "F:\\Selenium files\\IEDriverServer_Win32_3.14.0\\IEDriverServer.exe");
	WebDriver driver = new InternetExplorerDriver();
	driver.get("https://www.google.com");
	WebElement element = driver.findElement(By.name("q"));
//	if(element==true) {
//		System.out.println("Passed");
//	}else {
//		System.out.println("Failed");
//	}
	element.sendKeys("java",Keys.ENTER);
	}
}
