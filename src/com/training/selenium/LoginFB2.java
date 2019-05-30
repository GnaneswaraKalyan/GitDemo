package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginFB2 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("email")).sendKeys("kalyanram30694@gmail.com");
	driver.findElement(By.id("pass")).sendKeys("Invalid",Keys.ENTER);
		
	}

}
