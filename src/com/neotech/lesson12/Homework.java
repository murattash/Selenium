package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework extends CommonMethods{
	
	public static void main(String[] args) {
		
		//http://uitestpractice.com/Students/SwitchTo
		
		setUp();
		
		//switch to frame by index
		switchToFrame(0);
		WebElement nameBox = driver.findElement(By.id("name"));
		sendText(nameBox, "Flori");
		wait(2);
		driver.switchTo().defaultContent();
		
		
		//switch to frame by name
		switchToFrame("iframe_a");
		WebElement nameBox_2 = driver.findElement(By.id("name"));
		sendText(nameBox_2, "Enes");
		wait(2);
		driver.switchTo().defaultContent();
		
		
		
		//switch to frame by webelement
		switchToFrame(driver.findElement(By.xpath("//iframe[@name='iframe_a']")));
		WebElement nameBox_3 = driver.findElement(By.id("name"));
		sendText(nameBox_3, "Murat");
		wait(2);
		driver.switchTo().defaultContent();
		
		
		
		tearDown();
		
	}

}
