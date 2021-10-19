package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Task extends BaseClass {

	//https://www.techlistic.com/p/demo-selenium-practice.html
	
	public static void main(String[] args) {
		
		setUp();
		
		
		WebElement table = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody"));
		String expectedText = "Financial Center";
		String actualText = table.getText();
		
		if (actualText.contains(actualText)) {
			System.out.println(expectedText + " is in the table. Test case passed");
		} else {
			System.out.println(actualText + " is in the table. Test case failed");
		}
		
		System.out.println("=======Name of column headers======");
		
		List<WebElement> headerData = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/thead/tr/th"));
		for(WebElement header : headerData) {
			String columnHeader = header.getText();
			System.out.print(columnHeader + " | ");
		}
		
		System.out.println();
		
		
		System.out.println("=======Data from all rows=======");
		List<WebElement> tableRows = driver.findElements(By.xpath("//table[@class='tsc_table_s13']/tbody/tr"));
		for(WebElement row : tableRows) {
			String rowText = row.getText();
			System.out.println(rowText);
		}
		
		
		tearDown();
			
		
	}
	
}
