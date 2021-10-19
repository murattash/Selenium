package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class ScreenShotDemo extends CommonMethods {
	
	public static void main(String[] args) {
		
		//https://opensource-demo.orangehrmlive.com/
	
		setUp();
		
		//using our own sendText() method		
		sendText(driver.findElement(By.id("txtUsername")), "Admin");
		sendText(driver.findElement(By.id("txtPassword")), "admin123");
		
		
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		
		try {
		FileUtils.copyFile(ts1.getScreenshotAs(OutputType.FILE), new File("screenshot_1.png"));
		}
		catch(IOException e1) {
			e1.printStackTrace();
		}
		
		driver.findElement(By.id("btnLogin")).click();;
		
		//creating a TakeScreenshot object
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		//take Screenshot and save it as an object type of File
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
		FileUtils.copyFile(source, new File("screenshot.png")); //this will save in the current project folder
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		tearDown();
		
		
	}

}
