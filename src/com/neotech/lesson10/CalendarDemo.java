package com.neotech.lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class CalendarDemo extends BaseClass{
	
	public static void main(String[] args) {
		
		setUp();
		
		
		driver.findElement(By.xpath("//span[@id='calDepartLabelCont']/span[2]"));
		
		String month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		
		//loop until we see January
		while (!month.equals("January")) {
			driver.findElement(By.xpath("//span[text()='Next']")).clear();
			month = driver.findElement(By.xpath("//span[@class='dl-datepicker-month-0']")).getText();
		}
		
		
		
		
		
		
		tearDown();
		
		
		
	}

}
