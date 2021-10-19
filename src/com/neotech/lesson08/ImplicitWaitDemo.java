package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass{
	
	public static void main(String[] args) {
	
		
	//http://uitestpractice.com/Students/Contact	
		setUp();  
		
		driver.manage().window().fullscreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); //for 20 second it will retun the code to find the text b/c the link is loading
		
		driver.findElement(By.linkText("This is a Ajax link")).click();
		
		
		//we want to get the text after the Ajax link done loading
		String resultText = driver.findElement(By.className("ContactUs")).getText();		
		System.out.println(resultText);
		
		
		tearDown();
		
		
		
	}
	
	
	

}
