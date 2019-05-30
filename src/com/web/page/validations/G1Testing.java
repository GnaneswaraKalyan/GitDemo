package com.web.page.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class G1Testing {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();

	driver.get("https://www.google.com");
	driver.findElement(By.name("q")).sendKeys("java",Keys.ENTER);
	
	
	driver.close();
	}

}
