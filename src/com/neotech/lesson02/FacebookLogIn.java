package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogIn {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("neotech@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("neotech@gmail.com");
		
		//driver.findElement(By.id("u_0_b_lX")).click();
		//it will not find because the id changes everytime 
		
		Thread.sleep(2000);
		
		driver.findElement(By.linkText("Forgot Password?")).click();
		
		driver.quit();
		
	}

}
