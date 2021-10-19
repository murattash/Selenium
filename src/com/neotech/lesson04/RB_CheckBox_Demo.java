package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RB_CheckBox_Demo {
	
	public final static String url = "https://demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		// 1st way of clicking on radio buttons
		// WebElement male =
		// driver.findElement(By.cssSelector("label[for='gender-radio-1']"));
		// male.click();
		// Thread.sleep(1000);
		//
		// WebElement female =
		// driver.findElement(By.cssSelector("label[for='gender-radio-2']"));
		// female.click();
		// Thread.sleep(1000);
		//
		// WebElement other =
		// driver.findElement(By.cssSelector("label[for='gender-radio-3']"));
		// other.click();
		// Thread.sleep(1000);
		
		
		
		// 2nd way of clicking on radio buttons
		List<WebElement> genders = driver.findElements(By.cssSelector("label[for^='gender-radio']"));
		genders.get(1).click(); // get the element with index 1 and click on it 
		Thread.sleep(1000);
		
		for (WebElement element : genders) {
			element.click();
			Thread.sleep(1000);
		}
		
		
		// finding all checkboxes and stroring them in a list
		List<WebElement> hobbies = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
		
			for (WebElement chBox : hobbies) {
				String label = chBox.getText();
				if (label.equals("Reading")) {
					chBox.click();
				}
				
			}
		
			Thread.sleep(3000);
		
		driver.quit();
		
	}
}
