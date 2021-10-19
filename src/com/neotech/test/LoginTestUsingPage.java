package com.neotech.test;

import com.neotech.pages.DashboardPage;
import com.neotech.pages.LoginPage;
import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTestUsingPage extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		// at this point we are finding the elements
		LoginPage login = new LoginPage();
		
		//sending the username
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		
		wait(2);
		
		login.loginBtn.click();
		
		DashboardPage ohrml = new DashboardPage(); //this has to be before you use the object
		
		ohrml.Welcome();
		
		tearDown();
		
	}
	
	
}
