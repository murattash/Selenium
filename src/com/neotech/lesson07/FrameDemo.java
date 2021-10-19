package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		//There are 3 ways to switch to the Frame
		
		// 1st way, Switch to the frame by index
		driver.switchTo().frame(0); //passing the index of the frame
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.sendKeys("Baba yuregi: ");
		
		Thread.sleep(1000);
		
		//If I am switched inside the frame, I cannot find anything outside the frame
		//driver.findElement(By.id("alert"));
		driver.switchTo().defaultContent(); //This will switch the focus to the main page

		
		// 2nd way, Switch to the frame by Name OR ID
		driver.switchTo().frame("iframe_a"); //passing the name of the frame
		nameText.clear();
		nameText.sendKeys("Murat");
		
		
		
		// 3rd way, Switch to the frame by WebElement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frameElement);
		nameText.clear();
		nameText.sendKeys("Mufasa");
		
		
		Thread.sleep(1000);
		
		
		tearDown();
		
	}
	
	
}
