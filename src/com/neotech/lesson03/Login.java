package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public final static String url = "https://signal-telecom.net/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.linkText("Sign In")).click();
		
		driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");
		driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");
		
		driver.findElement(By.id("send2")).click();
		
		Thread.sleep(5000);
		
		//new topic, xpath
		driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul/li[2]/div/ul/li[3]/a"));
		
		
		
		
		driver.quit();
		
	}

}
