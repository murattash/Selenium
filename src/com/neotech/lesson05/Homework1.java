package com.neotech.lesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
	
	public static final String url = "https://www.amazon.com/";

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of all links is -> " );
		
		int count = 0;
		
		for (WebElement link : links) {
			if(!link.getText().isEmpty()) {
				System.out.println(link.getText());
				count++;
			}
			
		}
		
		System.out.println("The number of all links is -> " + links.size());
		System.out.println("The number of all links that have a text -> " + count);
		
	}
}
