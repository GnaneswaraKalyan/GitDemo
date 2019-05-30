package com.training.selenium.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSearchboxContent {
	@Test
	
	public void test_search_box_content() {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		WebElement searchTextBoxContent = driver.findElement(By.name("q"));
		searchTextBoxContent.sendKeys("Java");
		String actualContent = searchTextBoxContent.getAttribute("Value");
		Assert.assertEquals(actualContent, "Java");
		driver.close();
		
	}

}
