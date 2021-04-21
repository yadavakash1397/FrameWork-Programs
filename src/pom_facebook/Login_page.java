package pom_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page
{

	//1
	@FindBy(xpath = "//input[@id='email']") private WebElement email;
	
	@FindBy(xpath = "//input[@id='pass']")private WebElement password;
	
	@FindBy(xpath = "//button[@name='login']") private WebElement login_btn;
	
	//2
	Login_page (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void setLogin_pageemail() 
	{
		email.sendKeys("9766974252");
	}
	
	void setLogin_pagepassword()
	{
		password.sendKeys("917566099@k@sh735");
	}
	
	void clickLogin_pagelogin_btn()
	{
		login_btn.click();
	}
	
	
}
