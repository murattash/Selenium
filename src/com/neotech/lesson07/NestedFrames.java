package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		//Switch to the frame using the ID
		driver.switchTo().frame("frame1"); //parent frame
		
		//let us locate the child frame 
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		
		//let us switch to the child frame
		driver.switchTo().frame(childFrame);
		
		//now we are searching inside the child frame
		WebElement p = driver.findElement(By.xpath("//body/p"));
		
		System.out.println("The text inside the child frame -> " + p.getText());
		
		//at this point the focus is inside the child frame
		//try to find anything in the main page 
		//you will get an error
		
		driver.switchTo().defaultContent(); //will switch the focus to the main page 
		
		
		tearDown();
		
	}
	
	
}
