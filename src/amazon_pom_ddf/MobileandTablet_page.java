package amazon_pom_ddf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MobileandTablet_page 
{
	//1
	@FindBy(xpath = "//a[text()='All Mobile Phones']")private WebElement allmobilephone;
	
	//2
	MobileandTablet_page(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//3
	void click_MobileandTablet_page_mobile()
	{
		allmobilephone.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
