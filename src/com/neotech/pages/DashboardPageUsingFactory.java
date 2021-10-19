package com.neotech.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.neotech.utils.BaseClass;
import com.neotech.utils.CommonMethods;

public class DashboardPageUsingFactory extends CommonMethods {
	
	@FindBy(xpath = "//a[@id='welcome']")
	public WebElement welcome;
	
	public DashboardPageUsingFactory() {
		PageFactory.initElements(BaseClass.driver, this);
		
	}
	
	
}
