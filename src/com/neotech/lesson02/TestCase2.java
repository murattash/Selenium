package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/");
			
		driver.findElement(By.linkText("REGISTER")).click();	
		
		driver.findElement(By.name("firstName")).sendKeys("John");
		driver.findElement(By.name("lastName")).sendKeys("Hope");	
		driver.findElement(By.name("phone")).sendKeys("123456789");	
		driver.findElement(By.id("userName")).sendKeys("john@neotech.com");
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
