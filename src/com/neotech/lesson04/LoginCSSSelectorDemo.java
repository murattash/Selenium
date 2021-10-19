package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCSSSelectorDemo {
	
public final static String url = "https://signal-telecom.net/";
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get(url);
		
		//driver.findElement(By.xpath("//li[@class='authorization-link']"));
		driver.findElement(By.cssSelector("li.authorization-link")).click(); // used for class 
		
		//driver.findElement(By.xpath("//input[@title='Email']")).sendKeys("roni_cost@example.com");
		driver.findElement(By.cssSelector("input[title='Email']")).sendKeys("roni_cost@example.com");
		
		//driver.findElement(By.xpath("//input[@title='Password']")).sendKeys("roni_cost3@example.com");
		driver.findElement(By.cssSelector("input#pass")).sendKeys("roni_cost3@example.com");
		
		//driver.findElement(By.xpath("//*[@id='send2']")).click();
		driver.findElement(By.cssSelector("button[id='send2']")).submit();
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}	

}
