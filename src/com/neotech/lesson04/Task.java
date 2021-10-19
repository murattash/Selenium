package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	
public final static String url = "https://www.facebook.com/";

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.cssSelector("input[class^='inputtext']")).sendKeys("Test@hotmail.com");
		
		driver.findElement(By.cssSelector("input#pass")).sendKeys("Test123");
		
		driver.findElement(By.cssSelector("button[id^='u_0']")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
	}	

}
