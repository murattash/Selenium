package com.neotech.lesson05;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework2 {
	
public static final String url = "https://demoqa.com/radio-button/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		
		List<WebElement> radioList = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement radio : radioList) {
			if(radio.isEnabled()) {
				System.out.println("Radio is enabled!");
			} else {
				System.out.println("Radio is NOT ebabled");
			}
		
		}

		Thread.sleep(1000);
		
		List<WebElement> labelList = driver.findElements(By.xpath("//input[starts-wth(@clas, 'custom-control-label']"));
		for(WebElement radio : labelList) {
			if(radio.isDisplayed()) {
				System.out.println("Label is displayed!");
			} else {
				System.out.println("Label is NOT displayed");
			}
				
		}
		
		
		
		driver.quit();
		
		
	}
}
