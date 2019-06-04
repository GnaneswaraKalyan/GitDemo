package com.guru99;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium files\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		WebElement b=driver.findElement(By.xpath("//div[@class='nav-right']/div[@id='nav-tools']/a[1]"));
		
		
		
		
		Actions a=new Actions(driver);
		a.moveToElement(b).perform();
		System.out.println("Done");
		System.out.println("Done");
		System.out.println("Done");System.out.println("Done");
		driver.close();
	}

}
