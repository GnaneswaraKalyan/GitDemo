package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BackSpaceText {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F://Selenium files//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement searchText=driver.findElement(By.name("q"));
	searchText.sendKeys("Python");
	Thread.sleep(3000);
	searchText.sendKeys(Keys.CONTROL,"a",Keys.BACK_SPACE);
	Thread.sleep(3000);
//	searchText.clear();
	Thread.sleep(3000);
	searchText.sendKeys("Java");
//	driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
//	driver.close();
	}


}
