package amazon_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_page_2 
{
	//1
	//password
	@FindBy(xpath = "//input[@id='ap_password']")private WebElement password;
	
	//signin
	@FindBy(xpath = "//input[@id='signInSubmit']")private WebElement signinbtn;
	
	//2
	SignIn_page_2 (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void set_SignIn_page_2_password(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	void click_SignIn_page_2_signbtn()
	{
		signinbtn.click();
	}
	
}
