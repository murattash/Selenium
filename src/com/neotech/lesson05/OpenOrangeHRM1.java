package com.neotech.lesson05;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenOrangeHRM1 {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		//We read the configuration file
		String filePath = System.getProperty("user.dir") + "/configs/configuration.properties";
		FileInputStream fis = new FileInputStream(filePath);
		
		//We load all the rows in key=value pair
		Properties prop = new Properties();		
		prop.load(fis); 
		
		System.out.println(prop);
		
		//Starting with Selenium classes and methods
		WebDriver driver = null;
		
		if(prop.getProperty("browser").equals("chrome")) {
			System.out.println("I want to open chrome browser");
			System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
			driver = new ChromeDriver();
		} else if (prop.getProperty("browser").equals("firefox")) {
			System.out.println("I want to open firefox browser");
			System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
			driver = new FirefoxDriver();
		}
		
		driver.get(prop.getProperty("url"));
		
		String title = driver.getTitle();
		System.out.println("title ->" + title);
		
		
		Thread.sleep(3000);
		driver.quit();
		
	}

}
