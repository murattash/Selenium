package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {

	public final static String url = "https://www.facebook.com/";

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test@hotmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("Test123");
		
		driver.findElement(By.xpath("//button[@name='login']")).click();
		//driver.findElement(By.xpath("//button[contains(@id, 'u_0']")); << we can also do this way by using contains it searches in the middle and end too 
		//the button that has an id attribute, the value of the attribute contains u_0 
		
		
		Thread.sleep(5000);
		
		driver.quit();
		
	}

}