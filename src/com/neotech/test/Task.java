package com.neotech.test;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class Task extends CommonMethods{

	//https://www.facebook.com/r.php
	
	public static void main(String[] args) {
		
		setUp();
		
		selectDropdown(driver.findElement(By.id("month")), "May");
		
		wait(3);
		
		selectDropdown(driver.findElement(By.id("day")), "17");

		wait(3);
		
		selectDropdown(driver.findElement(By.id("year")), "1998");

		wait(3);
		
		
		tearDown();
		
		
	}
	
	
	
}
