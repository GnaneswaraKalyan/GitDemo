package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLink {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
//	WebElement gmailLink=driver.findElement(By.linkText("Gmail"));
//	gmailLink.click();
	driver.findElement(By.linkText("Gmail")).click();
	
	driver.findElement(By.linkText("Create an account")).click();
	}

}
