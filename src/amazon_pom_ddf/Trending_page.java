package amazon_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Trending_page 
{
	//1
	
	//name
	@FindBy(xpath = "//div[@id='hmenu-customer-name']/b")private WebElement name;
	
	//mobile and comp
	@FindBy(xpath = "//div[text()='Mobiles, Computers']")private WebElement mobile;
	
	//signout
	@FindBy(xpath = "(//a[contains(@onclick,'$Nav.getNow(')])[2]")private WebElement signout;
	
	
	//2
	Trending_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void verify_Trending_page_name(String NAME)
	{
		if(name.getText().contains(NAME))
		{
			System.out.println("name verified");
		}
		else
		{
			System.out.println("name not verified");
		}
	}
	
	void click_Trending_page_mobile()
	{
		mobile.click();
	}
	
	void click_Trending_page_signout()
	{
		signout.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
