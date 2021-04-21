package assertion_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class Profile_page
{
	//1
	@FindBy(xpath = "//a/h4[@class='username']")private WebElement name;
	
	@FindBy(xpath = "//a[@href='/logout']")private WebElement logout;
	
	//2
	Profile_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void verifyProfile_pagename(String NAME,SoftAssert sa) 
	{
		sa.assertEquals(name.getText(), NAME);
		Reporter.log(name.getText(),true);
	}
	
	void clickProfile_pagelogout()
	{
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
