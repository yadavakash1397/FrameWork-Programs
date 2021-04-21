package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	void verifyProfile_pagename(String NAME) 
	{
		if(NAME.equals(name.getText()))
		{
			System.out.println("name is verifed");
		}
		else
		{
			System.out.println("name is not verified");
		}
	}
	
	void clickProfile_pagelogout()
	{
		logout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
