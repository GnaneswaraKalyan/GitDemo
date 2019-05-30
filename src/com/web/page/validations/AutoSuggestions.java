package com.web.page.validations;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com");

		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(7000);
		List<WebElement> options=driver.findElements(By.xpath("//div[@class='sbl1']"));
		int size=options.size();
		for(int i=0;i<size;i++) {
			WebElement option=options.get(i);
			String text = option.getText();
			System.out.println(text);
			driver.close();
		}
		
		
	}

}
