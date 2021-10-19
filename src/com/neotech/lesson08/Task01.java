package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class Task01 extends BaseClass {
	
	public static void main(String[] args) throws InterruptedException {
		
	setUp();
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.linkText("Dynamic Loading")).click();
	
	driver.findElement(By.linkText("Example 1: Element on page that is hidden")).click();
	
	//driver.findElement(By.id("start")).click();
	driver.findElement(By.xpath("//div[@id='start']/button")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, 15);
	
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']/h4")));
	
	String str = driver.findElement(By.xpath("//div[@id='finish']/h4")).getText();
	
	System.out.println(str);
	
	tearDown();	
		
		
	}

}
 