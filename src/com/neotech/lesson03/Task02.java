package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task02 {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dickssportinggoods.com/");
				
		driver.navigate().refresh();
				
		driver.findElement(By.xpath("//p[@class='account-main-text']")).click();		
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
