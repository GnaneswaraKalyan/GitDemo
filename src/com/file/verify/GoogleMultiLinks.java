package com.file.verify;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleMultiLinks {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);
		
		List<WebElement> links = driver.findElements(By.xpath("//div[@class='rc']/div/a/h3"));
		for(int i=0;i<links.size();i++) {
			links.get(i);
			Thread.sleep(5000);
			String title=driver.getTitle();
			System.out.println(title);
			driver.navigate().back();
			Thread.sleep(5000);
			links = driver.findElements(By.xpath("//div[@class='rc']/div/a/h3"));			
	
		}
		driver.close();
	}
	
	

}
