package com.web.page.validations;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHandling {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\\\Selenium files\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://javascriptkit.com/javatutors/alert2.shtml");
		//Alert Pop up
//		driver.findElement(By.name("B2")).click();
//		Alert alt= driver.switchTo().alert();
//		Thread.sleep(3000);
//		alt.accept();

//		driver.findElement(By.name("B3")).click();

		// confimation pop up
//		Thread.sleep(3000);
//		Alert alt = driver.switchTo().alert();
//		Thread.sleep(3000);
//		alt.dismiss();
//		driver.close();
		
		// Prompt Pop up
		driver.findElement(By.name("B4")).click();
		
		Thread.sleep(3000);
		Alert alt = driver.switchTo().alert();
		alt.sendKeys("Ram");
		
	Thread.sleep(3000);
	alt.accept();
	driver.close();
		
	}

}
