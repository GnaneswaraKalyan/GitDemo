package com.file.verify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///C:/Users/Gnaneswara%20Kalyan/Desktop/Sample%20Page.html");
		
		
		WebElement element= driver.findElement(By.xpath("//tr[td[text()='Python']]/td/input[@type='checkbox']"));
		Thread.sleep(3000);
		element.click();
	}
}
