package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class DynamicTable2 extends BaseClass {

public static void main(String[] args) throws InterruptedException {
	

	//https://opensource-demo.orangehrmlive.com/
	setUp();
	
	driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	driver.findElement(By.id("btnLogin")).click();
	
	driver.findElement(By.id("menu_pim_viewPimModule")).click();
	
	Thread.sleep(2000);
	
	String expectedValue = "Charlie";
	
	//Locating all the rows of the table
	List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
	for (int i = 0; i < rows.size(); i++) { 	//loop all the rows
		String rowText = rows.get(i).getText(); //get text of one row
		
		if(rowText.contains(expectedValue)) {
			//list starts from 0, Webtable starts from 1
			int rowIndex = i + 1;
			String path = "//table[@id='resultTable']/tbody/tr[" + rowIndex + "]/td[1]";
			System.out.println(path);
			
			driver.findElement(By.xpath(path)).click();
			break;
		}
		
		
	}
	
	Thread.sleep(4000);
	
	tearDown();
	
	
	
	
	
}
	
	
	
}
