package com.neotech.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class DashboardPage extends CommonMethods{
	 
	 public void Welcome() {
		 
		 WebElement orangeHRMLogo = driver.findElement(By.id("welcome"));
		 
		 if (orangeHRMLogo.isDisplayed()) {
				System.out.println("Test Passed");
			} else {
				System.out.println("Test Failed");
			}
			
		 
	 }

}
