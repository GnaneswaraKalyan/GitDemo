package com.web.page.validations;

import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
		Thread.sleep(3000);
		WebElement element1 =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
		driver.navigate().refresh();
		int size=0;
		for(int i=0;i<=size;i++) {
			try {
				WebElement element =driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div/div[1]/div/div[1]/input"));
				element.sendKeys("Java",Keys.ENTER);
				String str = driver.getTitle();
				System.out.println(str);
				break;
			} 
			catch (Exception e) {
			e.printStackTrace();
			}
		}		
		
		driver.close();
	}

}
