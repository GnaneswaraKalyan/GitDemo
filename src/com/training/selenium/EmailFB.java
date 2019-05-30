package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailFB {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement email=driver.findElement(By.id("email"));
	email.sendKeys("kalyanram30693@gmail.com");
	email.sendKeys(Keys.CONTROL,"a");
	Thread.sleep(3000);
	email.sendKeys(Keys.CONTROL,"c");
	WebElement pass= driver.findElement(By.name("pass"));
	Thread.sleep(3000);
	pass.sendKeys(Keys.CONTROL,"v");
	}

}
