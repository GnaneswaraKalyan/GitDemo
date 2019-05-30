package com.web.page.validations;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignTest {

	public static void main(String[] args) throws Exception {
	System.setProperty("webdriver.chrome.driver","F:\\Selenium files\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	WebElement textbox=driver.findElement(By.name("q"));
	textbox.sendKeys("java",Keys.ENTER);
		Thread.sleep(5000);
	WebElement link = driver.findElement(By.cssSelector(".LC20lb"));
	link.click();
	Thread.sleep(5000);
	WebElement downloadlink = driver.findElement(By.linkText("Download"));
	downloadlink.click();
	Thread.sleep(5000);
	
	WebElement javaText = driver.findElement(By.linkText("What is Java?"));
	javaText.click();
	Thread.sleep(5000);
	String text = downloadlink.getText();
	System.out.println(text);
	Thread.sleep(3000);
	driver.close();
	}

}
