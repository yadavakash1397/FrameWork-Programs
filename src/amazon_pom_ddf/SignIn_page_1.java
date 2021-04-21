package amazon_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_page_1 
{
	//1
	//phone no
	@FindBy(xpath = "//input[@id='ap_email']")private WebElement Phonenumber;
	
	//continue
	@FindBy(xpath = "//input[@id='continue']")private WebElement cont;
	
	//2
	SignIn_page_1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void set_SignIn_page_phoneNo(String Number)
	{
		Phonenumber.sendKeys(Number);
	}
	
	void click_SignIn_page_cont()
	{
		cont.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
