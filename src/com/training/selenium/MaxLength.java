package com.training.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaxLength {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost:8888/index.php?");
		
		WebElement element=driver.findElement(By.xpath("//input[@name='user_name']"));
		WebElement pwd=driver.findElement(By.xpath("//input[@name='user_password']"));
		WebElement login=driver.findElement(By.xpath("//input[@id='submitButton']"));
		
		element.sendKeys("admin");
		pwd.sendKeys("admin");
		login.click();
		
		WebElement more=driver.findElement(By.linkText("More"));
		WebElement invoice=driver.findElement(By.name("Invoice"));
		
		more.click();
		invoice.click();
	//driver.close();
	}

}
