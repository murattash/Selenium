package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass{

	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		
		driver.findElement(By.id("alert")).click();
		
		Thread.sleep(2000);
		
		
		//if the alert is not handled (closed) and try to interact wih other element
		//we will get a UnhandledAlertException
		//driver.findElement(By.id("confirm")).click();
		
		Thread.sleep(2000);
		
		//handling simple alerts
		Alert simpleAlert = driver.switchTo().alert();
		String alertText = simpleAlert.getText();
		System.out.println("The text of the alert is " + alertText);
		simpleAlert.accept();
		
		
		//handling confirm alerts
		driver.findElement(By.id("confirm")).click();
		Alert confAlert = driver.switchTo().alert();
		String confText = confAlert.getText();
		System.out.println(confText);
		
		//if we accept() --> we clicked on OK
		//confAlert.accept();	
		
		//if we dismiss() --> we clicked on Cancel
		confAlert.dismiss();
		
		
		//handling prompt alerts 
		driver.findElement(By.id("prompt")).click();
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.getText();
				
		
		
		tearDown();
		
	}
	
	
	
}
