package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		Select verifyMonth = new Select(month);
		List<WebElement> mothList = verifyMonth.getOptions();
		int sizeMonth = mothList.size();
		System.out.println("The size of the month is " + sizeMonth);
		Thread.sleep(3000);
		
	
		WebElement day = driver.findElement(By.id("day"));
		Select verifyDay = new Select(day);
		List<WebElement> dayList = verifyDay.getOptions();
		int sizeDay = dayList.size();
		System.out.println("The size of the day is " + sizeDay);
		Thread.sleep(3000);
		
		
		WebElement year = driver.findElement(By.id("year"));
		Select verifyYear = new Select(year);
		List<WebElement> yearList = verifyYear.getOptions();
		int sizeYear = yearList.size();
		System.out.println("The size of the year is " + sizeYear);
		Thread.sleep(3000);
		
		
		verifyMonth.selectByIndex(4);
		verifyDay.selectByIndex(15);
		verifyYear.selectByIndex(100);
		Thread.sleep(1000);
		
		
		tearDown();
		
		
		
	}
	
	
}
