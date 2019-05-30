package com.training.selenium.TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestGoogle {
	
	// Test Case 1
	@Test
	public void test_google_title() {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?");
		
	String actualResult=driver.getTitle();;
	String expectedResult="Google";
	Assert.assertEquals(actualResult, expectedResult);
	driver.close();
	}
	// Test Case 2
	
@Test
	public void test_gmailLink() {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		WebElement element =driver.findElement(By.linkText("Gmail"));
		boolean actualContent= element.isEnabled();
		Assert.assertEquals(actualContent, true);
		driver.close();
		
	}
}
