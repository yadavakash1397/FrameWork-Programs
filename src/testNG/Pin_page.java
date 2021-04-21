package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{

	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement cont;
	
	public Pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void set_Pin_page_pin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void click_Pin_page_cont()
	{
		cont.click();
	}
	
}
