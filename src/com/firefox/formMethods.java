package com.firefox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Before click on multi cities radio button");
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']/div")).isDisplayed());
		driver.findElement(By.xpath("//div[@class='makeFlex']/ul/li[3]")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='fsw_inputBox dates reDates inactiveWidget ']/div")).isDisplayed());
	
	}

}
