package method_for_all_data;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	//1
	@FindBy(xpath = "//input[@id='userid']")private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login ']")private WebElement login_butn;
	
	//2
	Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void setLogin_pageusername(String un)
	{
		username.sendKeys(un);
	}
	
	void setLogin_pagepassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	void clickLogin_pagelogin_butn()
	{
		login_butn.click();
		
	}
	
	
	
	
}
