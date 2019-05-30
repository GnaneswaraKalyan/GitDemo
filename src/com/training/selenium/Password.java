package com.training.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Password {
public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement textbox=driver.findElement(By.id("email"));
	String value=textbox.getAttribute("type");
	if(value.equals("password")) {
		System.out.println("Its a Password text box");
	}else {
		System.out.println("Its a Username text box");
	}
	
	}
}

