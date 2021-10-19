package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBoxes {
	
	public final static String url = "https://demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		// 1st way, NOT preffered, finding the element multiple times
		// driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Murat");
		//
		// driver.findElement(By.cssSelector("input#lastName")).sendKeys("Komron");
		// Thread.sleep(1000);
		//
		// driver.findElement(By.cssSelector("input#lastName")).sendKeys("Baba");
		// Thread.sleep(3000);
		//
		// driver.findElement(By.cssSelector("input#lastName")).clear();
		// Thread.sleep(1000);
		//
		// driver.findElement(By.cssSelector("input#lastName")).sendKeys("Mufasa");
		// Thread.sleep(1000);
		
		
		// 2nd way, finding the element and storing in a variable
		WebElement lastname = driver.findElement(By.cssSelector("input#lastName"));
		lastname.clear();
		Thread.sleep(1000);
		lastname.sendKeys("Ivonne");
		Thread.sleep(1000);
		lastname.sendKeys("+Burhan");
		Thread.sleep(1000);
		lastname.clear();
		
		String idAttrValue = lastname.getAttribute("id");
		System.out.println("The value of id attribute is " + idAttrValue);
		
		String classAttrValue = lastname.getAttribute("class");
		System.out.println("The value of class attribute is " + classAttrValue);
		
		WebElement header = driver.findElement(By.xpath("//*[@id='app']/div/div/div[1]/div"));
		String headerText = header.getText();
		System.out.println(headerText);
		
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
		
	}

}	