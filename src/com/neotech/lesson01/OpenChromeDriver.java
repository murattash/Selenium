package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChromeDriver {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://www.google.com/";
	
		
		if (actualURL.equals(expectedURL)) {
			System.out.println("Tile = " + driver.getTitle());
		} else {
			System.out.println("Title does not match");
		}
		
		Thread.sleep(3000);
		
		driver.close();
		
		
	}

}
