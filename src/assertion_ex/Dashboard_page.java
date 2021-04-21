package assertion_ex;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.testng.asserts.SoftAssert;

public class Dashboard_page
{
	SoftAssert sa;
	//1
	@FindBy(xpath = "//span[@class='user-id']")private WebElement id;
	
	@FindBy(xpath = "//input[@id='search-input']")private WebElement search_box;
	
	//2
	public Dashboard_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void verifyDashboard_pageid(String ID,SoftAssert as)
	{
		
		as.assertEquals(id.getText(), ID);
		
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
