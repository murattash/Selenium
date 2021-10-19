package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Open chrome browser
//Navigate to “https://www.zillow.com/”
//Navigate to “https://www.google.com/”
//Navigate back to Zillow Page
//Refresh current page
//Verify url contains “Zillow”

public class Task {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.zillow.com/");
		
		driver.navigate().to("https://www.google.com/");

		driver.navigate().back();
		
		driver.navigate().refresh();
		
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();		
	}

}
