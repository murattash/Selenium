package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginXpathDemo {
	

	public final static String url = "https://signal-telecom.net/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);

		//using absolute path
		//driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		
		//better option, using custom xpath 
		driver.findElement(By.xpath("//li[@class='authorization-link']"));
		driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("roni_cost@example.com");
		driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("roni_cost3@example.com");
		
		
		
	}	
		
}
