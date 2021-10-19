package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods {

	public static void main(String[] args) {
		
		//http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwFileUpload
		
		setUp();
		
		
		String filePath = System.getProperty("user.dir") + "/screenshots/ScreenShot_1.png";
		
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		wait(2);
		
		if(getAlertText().equals("File uploaded!")) {
			System.out.println("Test Passed");
		}
		
		acceptAlert();
		
	
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("screenshotTask.png")); 
			}
			catch(IOException e) {
				e.printStackTrace();
		
			}
		
		
		
		tearDown();
		
	}
	
	
}
