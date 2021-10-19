package com.neotech.test;

import com.neotech.pages.DashboardPageUsingFactory;
import com.neotech.pages.LoginPageUsingFactory;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingFactory extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		//At this point we are NOT finding the elements
		//We are just telling how the element will be found
		LoginPageUsingFactory login = new LoginPageUsingFactory();
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password")); 
		
		login.loginBtn.click();
		
		wait(2);
		
		DashboardPageUsingFactory dashboard= new DashboardPageUsingFactory(); //we can put this anywhere in main method and it will execute the code
		
		 if (dashboard.welcome.isDisplayed()) {
				System.out.println("Test Passed");
			} else {
				System.out.println("Test Failed");
			}
		
		
		tearDown();
		
	}
	
	

}
