package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Homework2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
		
		WebDriver dr = new FirefoxDriver();
		
		String url = "https://www.redfin.com/";
		
		// Navigate to "https://www.redfin.com/"
		dr.get(url);
		
		// gives me the url of the page that I am currently 
		String actualURL = dr.getCurrentUrl();
		
		//Verify that you have navigated to "https://www.redfin.com"
		if (actualURL.equals(url)) {
			System.out.println("Url is as expected -> " + actualURL);
		} else {
			System.out.println(actualURL + " <- is NOT as expected -> " + url);
		}
		
		Thread.sleep(500);
		
		dr.close();
		
	}

}
