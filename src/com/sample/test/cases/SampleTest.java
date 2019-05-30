package com.sample.test.cases;

import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SampleTest {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://demo.actitime.com/login.do");
//		WebDriverWait wait =new WebDriverWait(driver, 30);
//		wait.until(ExpectedConditions.titleContains("whiteBoxWithLogoTable"));
		String title=driver.getTitle();
		System.out.println(title);
	
		WebElement userName=driver.findElement(By.name("username"));
		userName.sendKeys("admin");
		
		WebElement pwd=driver.findElement(By.name("pwd"));
		pwd.sendKeys("manager");
		
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		Thread.sleep(5000);
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(5000);
		
		driver.close();
	}
	
	}

