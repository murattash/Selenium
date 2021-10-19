package com.neotech.lesson07;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class WindowHandle_Demo extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.getTitle();
		
		//This will give the unique id of the window
		System.out.println("Handle - > " + driver.getWindowHandle());
		
		driver.findElement(By.linkText("Help")).click();
		
		Thread.sleep(3000);
		
		
		//This will give the unique Ids of all open windows, in Set<String>
		Set <String> allWindowHandles = driver.getWindowHandles();
		System.out.println(allWindowHandles.size());
		
		
		Iterator<String> it = allWindowHandles.iterator();
		String window1 = it.next();
		String window2 = it.next();
		
		System.out.println("window1 -> " +  window1);
		System.out.println("window2 -> " + window2);
		
		
		//switching to the windows using the code
		driver.switchTo().window(window2);
		String title2 = driver.getTitle();
		System.out.println(title2);
		
		
		tearDown();
		
		
		
	}
	

}
