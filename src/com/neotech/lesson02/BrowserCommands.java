package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		//driver.get("https://www.github.com/");
		//will not store the histroy 
		//waits for the page elements to be loaded 
		
		driver.navigate().to("https://www.github.com/"); 
		//save the history
		//does not wait the page to be fully loaded 
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen(); // -> make full screen
		
		driver.navigate().refresh(); // refresh the page
		
		driver.navigate().to("https://www.amazon.com/");
		
		driver.navigate().back(); // need to go back to github page
		
		driver.navigate().forward(); //brings you forward to amazon page 
		
		driver.quit();	
		
	}

}
