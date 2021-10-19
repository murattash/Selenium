package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver(); //WebDriver is an interface >> up-casting
		
		driver.get("https://www.amazon.com/");
		
		String actualTitle = driver.getTitle();
		
		String expectedTitle = "Amazon.com: Online Shopping";
		
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
		
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			System.out.println("A problem while waiting for 2 seconds");
		}
		
		
		driver.close();
		
	}

}
