package com.neotech.lesson05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class OpenOrangeHRM2 {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		ConfigsReader.readProperty(Constants.CONFIGURATION_FILEPATH);
		
		if(ConfigsReader.getProperty("browser").equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVE_PATH);
			driver = new ChromeDriver();
		} else if (ConfigsReader.getProperty("browser").equals("firefox")) {
			System.out.println("I want to open firefox browser");
			System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVE_PATH);
			driver = new FirefoxDriver();
		}
		
		driver.get(ConfigsReader.getProperty("url"));
		
		String title = driver.getTitle();
		System.out.println("title ->" + title);
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}
	
}
