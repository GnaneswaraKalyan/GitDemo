package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchText {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F://Selenium files//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	WebElement searchText=driver.findElement(By.name("q"));
	searchText.sendKeys("Python");
	Thread.sleep(3000);
	searchText.clear();
	searchText.sendKeys("Java");
	Thread.sleep(3000);
	driver.close();
	}

}
