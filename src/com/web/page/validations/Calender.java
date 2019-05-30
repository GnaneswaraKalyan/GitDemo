package com.web.page.validations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		
//		driver.findElement(By.id("BE_flight_origin_date")).click();
//		driver.findElement(By.id("30/01/2019")).click();
		
		@SuppressWarnings("unused")
		String js_command = "document.getElementById('BE_flight_origin_date').value=\"30/10/2019\"";
		
		@SuppressWarnings("unused")
		JavascriptExecutor js_driver = (JavascriptExecutor)driver;
		js_driver.executeScript(js_command);
		Thread.sleep(5000);
	
		driver.close();
	}

}
