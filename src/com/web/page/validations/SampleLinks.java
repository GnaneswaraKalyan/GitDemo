package com.web.page.validations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleLinks {

	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	WebElement element = driver.findElement(By.name("q"));
	element.sendKeys("java",Keys.ENTER);
	
	
	WebElement title = null;
	if(element==title) {
		
		WebElement title1 = driver.findElement(By.partialLinkText("Download Free"));
		System.out.println(driver.getTitle());
	}
	
	
	
	driver.close();
	
	
	
	}

}
