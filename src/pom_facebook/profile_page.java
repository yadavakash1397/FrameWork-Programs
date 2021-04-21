package pom_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class profile_page 
{
	//1
	@FindBy(xpath="//span[contains(@class,'lrazzd5p oo9gr5id hzawbc8m')]")private WebElement name;
	
	@FindBy(xpath = "//span[text()='Log Out']")private WebElement logout;
	
	//2
	profile_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void verifyprofile_pagename()
	{
		String expected="Akash Yadav";
		if(expected.equals(name.getText()))
		{
			System.out.println("name verfied ok");
		}
		else
		{
			System.out.println("fail to verify name");
		}
	}
	
	void clickprofile_pagelogout()
	{
		logout.click();
	}
	
}
