package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_1_page 
{
	//elements
	// step1 username
	@FindBy(xpath = "//input[@id='userid']") private WebElement UN;
	
	//step2 password
	@FindBy(xpath = "//input[@id='password']") private WebElement pwd;
	
	//step3 login
	@FindBy(xpath = "//button[text()='Login ']") private WebElement login;
	
	
	//constructor for initialize global variable    
	Login_1_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3 methods creating
	//username
	public void Enter_username()
	{
		UN.sendKeys("DV1510");
	}
	
	//password
	public void Enter_password()
	{
		pwd.sendKeys("Vijay@123");
	}
	
	//login
	public void Click_login()
	{
		login.click();
	}
	

}
