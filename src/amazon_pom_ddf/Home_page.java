package amazon_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page 
{
	//1
	
	//signin
	@FindBy(xpath = "//a[@id='nav-link-accountList']")private WebElement signIn;
	
	//all menu
	@FindBy(xpath = "//a[@id='nav-hamburger-menu']")private WebElement allMenu;
	
	//2
	Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void clickHome_pagesignIn()
	{
		signIn.click();
	}
	
	void clickHome_pageallmenu()
	{
		allMenu.click();
	}
	
	
	
	
	
	
	
	
}
