package pom_facebook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page
{
	//1
	@FindBy(xpath = "//div[@aria-label='Account']") private WebElement account;
	
	//2
	Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void clickHome_pageaccount()
	{
		account.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
