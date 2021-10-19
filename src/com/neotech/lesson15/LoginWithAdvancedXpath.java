package com.neotech.lesson15;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class LoginWithAdvancedXpath  extends CommonMethods {

	//url = https://opensource-demo.orangehrmlive.com/
	//Login to the application by writing xpath Advanced xpath
	
	public static void main(String[] args) {
		
		setUp();
		
		
		WebElement username = driver.findElement(By.xpath("//form[@id='frmLogin']/div[2]/input"));
		
		
		
		tearDown();
		
	}
	
}
