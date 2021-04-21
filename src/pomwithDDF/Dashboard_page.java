package pomwithDDF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page
{
	//1
	@FindBy(xpath = "//span[@class='user-id']")private WebElement id;
	
	@FindBy(xpath = "//input[@id='search-input']")private WebElement search_box;
	
	//2
	public Dashboard_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void verifyDashboard_pageid(String ID)
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
	
	public void clickDashboard_pageid()
	{
		id.click();
	}
	
	public void set_Dashboard_page_searchbox(String data)
	{
		search_box.sendKeys(data);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
