package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class DropdownMenu extends BaseClass{
	
	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_directory_viewDirectory")).click();
		
		//This find drop-down element
		WebElement ddTitle = driver.findElement(By.id("searchDirectory_job_title"));
		
		//Let us declare a Select object
		Select selDDTitle = new Select(ddTitle);
		
		//There are 3 different ways to select option from a drop-down
		
		//1st way
		selDDTitle.selectByIndex(2); //Selecting CEO
		Thread.sleep(2000);
		
		//2nd way
		selDDTitle.selectByVisibleText("Database Administrator");	
		Thread.sleep(2000);
		
		//3rd way
		selDDTitle.selectByValue("8");
		Thread.sleep(2000);
		
		//Get all options in a list
		List<WebElement> options = selDDTitle.getAllSelectedOptions();
 		
		System.out.println("The size of the list is " + options.size());
		
		//for (int i = 0; i < options.size(); i++) {
		//	selDDTitle.selectByIndex(i);
		//	Thread.sleep(1000);
		//}
		
		Select selDDLocatopn = new Select(driver.findElement(By.id("searchDirectory_location")));
		selDDLocatopn.selectByValue("1,2,5,-1");
		Thread.sleep(3000);
		
		
		//Let us click on search button 
		driver.findElement(By.id("searchBtn")).click();
		Thread.sleep(2000);
		
		
		
		tearDown();
		
	}

}
