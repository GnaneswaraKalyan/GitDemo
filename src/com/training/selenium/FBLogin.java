package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("kalyanram30693@gmail.com");
	Thread.sleep(3000);
	driver.findElement(By.name("pass")).sendKeys("Invalid");
	Thread.sleep(3000);
	driver.findElement(By.cssSelector("input[value='Log In']")).click();;
		
	}

}
