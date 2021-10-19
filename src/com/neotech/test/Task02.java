package com.neotech.test;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Task02 extends CommonMethods {
	
	//http://uitestpractice.com/Students/SwitchTo
	
	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("alert")).click();
		wait(3);
		System.out.println(getAlertText());
		wait(3);
		acceptAlert();
		wait(3);
		
		driver.findElement(By.id("confirm")).click();
		wait(3);
		dismissAlert();
		wait(3);
		
		driver.findElement(By.id("prompt")).click();
		wait(3);
		sendAlertText("Murat");
		wait(3);
		acceptAlert();
		wait(3);
		

		
		tearDown();
	
		
		
	}

}
