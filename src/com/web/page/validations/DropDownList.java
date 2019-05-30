package com.web.page.validations;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownList {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		WebElement DayDDL = driver.findElement(By.id("day"));
		Select DaySct = new Select(DayDDL);
		DaySct.selectByValue("30");
		//Month DDL
		WebElement MonthDDL = driver.findElement(By.id("month"));
		Select monthSct = new Select(MonthDDL);
		monthSct.selectByIndex(6);
			
		}
		
	}

