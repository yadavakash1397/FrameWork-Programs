package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page
{
	//1
	@FindBy(xpath = "//span[@class='user-id']")private WebElement id;
	
	//2
	Dashboard_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void verifyDashboard_pageid(String ID)
	{
		if(ID.equals(id.getText()))
		{
			System.out.println("id is matching");
		}
		else
		{
			System.out.println("id is not matching");
		}
	}
	
	void clickDashboard_pageid()
	{
		id.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
