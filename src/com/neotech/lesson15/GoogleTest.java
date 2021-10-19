package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class GoogleTest extends CommonMethods{
	
	//https://www.google.com/
	//Enter a text in search bo
	
	public static void main(String[] args) {
		
		setUp();
		
		WebElement searchBox = driver.findElement(By.name("q"));
				
		searchBox.sendKeys("iPhone");
		wait(3);
		
		
		searchBox.sendKeys(Keys.ENTER);
		
		tearDown();
		
	}
	
	
}
