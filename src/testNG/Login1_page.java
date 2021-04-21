package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1_page 
{
	//1
	//username
	@FindBy(xpath = "//input[@id='userid']")private WebElement username;
	
	//password
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	
	//login
	@FindBy(xpath = "//button[text()='Login ']")private WebElement login1;
	
	//2
	public Login1_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	public void set_Login1_page_username(String UN) 
	{
		username.sendKeys(UN);
	}
	
	public void set_Login1_page_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void click_Login1_page_loginbtn()
	{
		login1.click();
	}
}
