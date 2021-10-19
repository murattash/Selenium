package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {
	
	//https://accounts.lambdatest.com/register
//	Find the Password Element and enter a password
//	Find the Show span as a nephew of the password element and click on it
//	Find the Business Email as a cousin of the password element and enter an email
	
	public static void main(String[] args) {
		
		setUp();
		
		sendText(driver.findElement(By.id("userpassword")), "password123");
		
		WebElement show = driver.findElement(By.xpath("//div[@class='input-group-append']/span"));
		
		show.click();
		
		wait(2);
		
		tearDown();
		
	}

}
