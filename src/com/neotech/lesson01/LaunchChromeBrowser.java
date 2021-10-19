package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {
	
	public static void main(String[] args) throws InterruptedException {
		
		// Full Path --> /Users/mtashpulatov/eclipse-workspace/Selenium/drivers/chromedriver
		// Relative Path --> drivers/chromedirver
		
		// for Windows - chromedriver.exe
		// for Mac - chromedriver
		
								//Driver type  				//location
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver"); // where driver is located 
	
		
		// Declaring a variable of type WebDriver
		// Calling constructor of ChromeDriver
		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.amazon.com"); // The web page where I want to navigate 
		
		String url = driver.getCurrentUrl();
		System.out.println ("Current URL = " + url);
		
		String title = driver.getTitle();
		System.out.println("Title = " + title);
		
		Thread.sleep(2000);
		//2000 milliseconds = 2 seconds
		
		//driver.close(); // closing current tab
		
		driver.quit(); // closing the whole browser 
		
		
	}

}
